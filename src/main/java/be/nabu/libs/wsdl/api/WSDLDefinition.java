package be.nabu.libs.wsdl.api;

import java.util.List;

import be.nabu.libs.types.api.TypeRegistry;

public interface WSDLDefinition {
	public String getTargetNamespace();
	public TypeRegistry getRegistry();
	public List<Message> getMessages();
	public List<PortType> getPortTypes();
	public List<Binding> getBindings();
	public List<Service> getServices();
	public List<PolicyProvider> getPolicies();
	public List<WSDLDefinition> getImports();
}
