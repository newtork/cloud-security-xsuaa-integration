package com.sap.cloud.security.servlet;

import com.sap.cloud.security.token.Token;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * TokenAuthenticator is used to authenticate a user sending servlet requests to
 * a service via token. It produces a {@link TokenAuthenticationResult}. The
 * result contains the necessary information to perform container specific
 * authentication. <br>
 *
 * See {@code JettyTokenAuthenticator} in the java-security-test library on how
 * this is used with jetty to perform authentication.
 */
public interface TokenAuthenticator {

	/**
	 * Performs the authentication for the given request.
	 * 
	 * @param request
	 *            servlet request.
	 * @param response
	 *            servlet response.
	 * @return a {@link TokenAuthenticationResult}.
	 */
	TokenAuthenticationResult validateRequest(ServletRequest request, ServletResponse response);
}
