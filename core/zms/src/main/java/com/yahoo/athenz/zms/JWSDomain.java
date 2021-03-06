//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import java.util.Map;
import com.yahoo.rdl.*;

//
// JWSDomain - SignedDomain using flattened JWS JSON Serialization syntax.
// https://tools.ietf.org/html/rfc7515#section-7.2.2
//
public class JWSDomain {
    public String payload;
    @com.fasterxml.jackson.annotation.JsonProperty("protected") public String protectedHeader;
    public Map<String, String> header;
    public String signature;

    public JWSDomain setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return payload;
    }
    public JWSDomain setProtectedHeader(String protectedHeader) {
        this.protectedHeader = protectedHeader;
        return this;
    }
    public String getProtectedHeader() {
        return protectedHeader;
    }
    public JWSDomain setHeader(Map<String, String> header) {
        this.header = header;
        return this;
    }
    public Map<String, String> getHeader() {
        return header;
    }
    public JWSDomain setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return signature;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != JWSDomain.class) {
                return false;
            }
            JWSDomain a = (JWSDomain) another;
            if (payload == null ? a.payload != null : !payload.equals(a.payload)) {
                return false;
            }
            if (protectedHeader == null ? a.protectedHeader != null : !protectedHeader.equals(a.protectedHeader)) {
                return false;
            }
            if (header == null ? a.header != null : !header.equals(a.header)) {
                return false;
            }
            if (signature == null ? a.signature != null : !signature.equals(a.signature)) {
                return false;
            }
        }
        return true;
    }
}
