import org.w3c.dom.*;
import org.apache.xerces.parsers.DOMParser;
public class navXML{
	public static void displayDocument(String filename){
		try {
			DOMParser parser = new DOMParser();
			parser.parse(filename);
			Document document = parser.getDocument();
			display(document);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
	public static void display(Node node){
		Node textNode;
		Node documentNode = ((Document)node).getDocumentElement();
		textNode = documentNode.getFirstChild();
		Node customer1Node = textNode.getNextSibling();
		textNode = customer1Node.getNextSibling();
		Node customer2Node = textNode.getNextSibling();
		textNode = customer2Node.getFirstChild();
		Node nameNode = textNode.getNextSibling();
		textNode = nameNode.getFirstChild();
		Node lastNameNode = textNode.getNextSibling();
		textNode = lastNameNode.getNextSibling();
		Node firstNameNode = textNode.getNextSibling();
		textNode = firstNameNode.getFirstChild();
		System.out.println("First name: " +textNode.getNodeValue() + "\n");
	}
	public static void main(String args[]){
		displayDocument("customers.xml");
	}
}