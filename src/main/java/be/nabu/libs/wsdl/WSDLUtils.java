/*
* Copyright (C) 2016 Alexander Verbruggen
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

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
