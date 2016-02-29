package be.nabu.libs.wsdl.api;

import java.util.List;

public interface PortType extends Fragment {
	public List<Operation> getOperations();
}
