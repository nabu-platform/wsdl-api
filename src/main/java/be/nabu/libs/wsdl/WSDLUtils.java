package be.nabu.libs.wsdl;

import be.nabu.libs.wsdl.api.Binding;
import be.nabu.libs.wsdl.api.Message;
import be.nabu.libs.wsdl.api.Operation;
import be.nabu.libs.wsdl.api.PortType;
import be.nabu.libs.wsdl.api.WSDLDefinition;


public class WSDLUtils {
	
	public static Message getMessage(WSDLDefinition definition, String namespace, String name) {
		if (namespace.equals(definition.getTargetNamespace())) {
			if (definition.getMessages() != null) {
				for (Message message : definition.getMessages()) {
					if (message.getName().equals(name)) {
						return message;
					}
				}
			}
		}
		else if (definition.getImports() != null) {
			for (WSDLDefinition imported : definition.getImports()) {
				Message message = getMessage(imported, namespace, name);
				if (message != null) {
					return message;
				}
			}
		}
		return null;
	}
	
	public static PortType getPortType(WSDLDefinition definition, String namespace, String name) {
		if (namespace.equals(definition.getTargetNamespace())) {
			if (definition.getPortTypes() != null) {
				for (PortType portType : definition.getPortTypes()) {
					if (portType.getName().equals(name)) {
						return portType;
					}
				}
			}
		}
		else if (definition.getImports() != null) {
			for (WSDLDefinition imported : definition.getImports()) {
				PortType portType = getPortType(imported, namespace, name);
				if (portType != null) {
					return portType;
				}
			}
		}
		return null;
	}
	
	public static Operation getOperation(PortType portType, String name) {
		if (portType.getOperations() != null) {
			for (Operation operation : portType.getOperations()) {
				if (operation.getName().equals(name)) {
					return operation;
				}
			}
		}
		return null;
	}
	
	public static Binding getBinding(WSDLDefinition definition, String namespace, String name) {
		if (namespace.equals(definition.getTargetNamespace())) {
			if (definition.getMessages() != null) {
				for (Binding binding : definition.getBindings()) {
					if (binding.getName().equals(name)) {
						return binding;
					}
				}
			}
		}
		else if (definition.getImports() != null) {
			for (WSDLDefinition imported : definition.getImports()) {
				Binding binding = getBinding(imported, namespace, name);
				if (binding != null) {
					return binding;
				}
			}
		}
		return null;
	}

}
