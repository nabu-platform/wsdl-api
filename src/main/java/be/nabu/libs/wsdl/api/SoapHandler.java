package be.nabu.libs.wsdl.api;

import be.nabu.libs.types.api.ComplexContent;

public interface SoapHandler {
	public ComplexContent handleRequest(BindingOperation operation, ComplexContent envelope);
	public ComplexContent handleResponse(BindingOperation operation, ComplexContent envelope);
}
