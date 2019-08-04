import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuickTest {
    private static final String NUANCE_LANGUAGE_XPATH_QUERY = "//*[local-name()='document']/page/description/language";
    public static void main(String[] args) {
        try{
            String xmlPath = "/Users/i851510/Desktop/ocr.xml";
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Document doc;
            try (InputStream xmlStream = new FileInputStream(xmlPath)) {
                doc = dbf.newDocumentBuilder().parse(xmlStream);
            }
            dbf.setNamespaceAware(true);
            XPath xpath = XPathFactory.newInstance().newXPath();
            XPathExpression expr = xpath.compile(NUANCE_LANGUAGE_XPATH_QUERY);
            NodeList nodeList= (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

            for (int i = 0; i < nodeList.getLength(); i++) {
                org.w3c.dom.Node childNode = nodeList.item(i);
                //System.out.println(childNode.getTextContent());
            }

            InputStream xmlStream = new FileInputStream(xmlPath);
            File file = new File(xmlPath);
            List<String> lang = getLanguageCode(file);
            System.out.println(lang);
        }
        catch(Exception e){
            System.out.println();
        }
    }

    private static List<String> getLanguageCode1(InputStream xmlResultFileStream) throws XPathExpressionException, ParserConfigurationException, IOException, SAXException {
        List<String> languageList = new ArrayList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = dbf.newDocumentBuilder().parse(xmlResultFileStream);
        dbf.setNamespaceAware(true);
        XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expr = xpath.compile(NUANCE_LANGUAGE_XPATH_QUERY);
        NodeList nodeList= (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            languageList.add(nodeList.item(i).getTextContent());
        }
        return languageList;
    }

    private static List<String> getLanguageCode(File xmlResultFile) throws XPathExpressionException, ParserConfigurationException, IOException, SAXException {
        List<String> languageList = new ArrayList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc;
        try (InputStream xmlStream = new FileInputStream(xmlResultFile)) {
            doc = dbf.newDocumentBuilder().parse(xmlStream);
        }
        dbf.setNamespaceAware(true);
        XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expr = xpath.compile(NUANCE_LANGUAGE_XPATH_QUERY);
        NodeList nodeList= (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            languageList.add(nodeList.item(i).getTextContent());
        }
        return languageList;
    }
}
