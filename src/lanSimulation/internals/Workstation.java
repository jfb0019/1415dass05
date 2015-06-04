package lanSimulation.internals;

public class Workstation extends Node {



	public Workstation(String name, Node nextNode) {
		super(name, nextNode);
		// TODO Auto-generated constructor stub
	}

	public Workstation(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void printNodeInformation(StringBuffer buf) {

		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}
	public void printXMLNodeInformation(StringBuffer buf) {

			buf.append("<workstation>");
			buf.append(name_);
			buf.append("</workstation>");
			
	}
}
