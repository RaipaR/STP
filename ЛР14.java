import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParserXML {
    private JFrame okno; // главное окно
    private JTree derevo; // компонент JTree для отображения содержимого XML-файла

    public ParserXML() {
        okno = new JFrame("Парсер XML"); // создание главного окна
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(500, 400); // установка размеров окна

        DefaultMutableTreeNode koren = new DefaultMutableTreeNode("Документ"); // создание корневого узла для JTree
        DefaultTreeModel model = new DefaultTreeModel(koren); // создание модели JTree с корневым узлом
        derevo = new JTree(model); // создание JTree с моделью

        JScrollPane scrollPane = new JScrollPane(derevo); // добавление возможности прокрутки для JTree
        okno.getContentPane().add(scrollPane); // добавление JTree на главное окно

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("file.xml"); // загрузка XML-файла

            Element korenElementa = document.getDocumentElement(); // получение корневого элемента
            prohod(korenElementa, koren); // рекурсивный обход элементов XML-файла

            model.reload(); // обновление модели JTree
        } catch (Exception e) {
            JOptionPane.showMessageDialog(okno, "Ошибка при загрузке XML-файла", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }

        okno.setVisible(true); // отображение окна
    }

    private void prohod(Element element, DefaultMutableTreeNode uzel) {
        DefaultMutableTreeNode noviyUzel = new DefaultMutableTreeNode(element.getTagName()); // создание узла для текущего элемента

        NodeList detskiiElementi = element.getChildNodes(); // получение дочерних элементов
        for (int i = 0; i < detskiiElementi.getLength(); i++) {
            Node detskiiElement = detskiiElementi.item(i);
            if (detskiiElement.getNodeType() == Node.ELEMENT_NODE) {
                Element elementDetskogoElementa = (Element) detskiiElement;
                prohod(elementDetskogoElementa, noviyUzel); // рекурсивный обход дочерних элементов
            }
        }

        uzel.add(noviyUzel); // добавление узла в родительский узел
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ParserXML(); // создание экземпляра парсера XML
            }
        });
    }
}
