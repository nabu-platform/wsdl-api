package be.nabu.libs.wsdl.api;

public enum Transport {
	HTTP("http://schemas.xmlsoap.org/wsdl/soap/", "http://schemas.xmlsoap.org/soap/http")
	;
	private String namespace;
	private String transport;

	private Transport(String namespace, String transport) {
		this.namespace = namespace;
		this.transport = transport;
	}
	public String getNamespace() {
		return namespace;
	}
	public String getTransport() {
		return transport;
	}
}
