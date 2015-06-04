package lanSimulation.internals;

public class Workstation extends Node {

	public Workstation(byte type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	public Workstation(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
		// TODO Auto-generated constructor stub
	}

	public void printNodeInformation(StringBuffer buf) {

		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}

}
