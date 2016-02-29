package be.nabu.libs.wsdl.api;

import java.util.List;

public interface Binding extends Fragment {
	public Transport getTransport();
	public PortType getPortType();
	public List<BindingOperation> getOperations();
}
