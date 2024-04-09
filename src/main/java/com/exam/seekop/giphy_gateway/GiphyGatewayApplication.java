package com.exam.seekop.giphy_gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.net.ssl.*;
import java.security.cert.X509Certificate;


@SpringBootApplication
public class GiphyGatewayApplication {

	public static void main(String[] args) {

		SpringApplication.run(GiphyGatewayApplication.class, args);

	}

	@Configuration
	public class SSLConfig {

		@Bean
		public void disableSSLValidation() {
			try {
				// Desactivar la validación SSL (NO RECOMENDADO)
				TrustManager[] trustAllCerts = new TrustManager[]{
						new X509TrustManager() {
							public java.security.cert.X509Certificate[] getAcceptedIssuers() {
								return null;
							}

							public void checkClientTrusted(X509Certificate[] certs, String authType) {
							}

							public void checkServerTrusted(X509Certificate[] certs, String authType) {
							}
						}
				};

				// Instalar el trust manager que no valida certificados
				SSLContext sslContext = SSLContext.getInstance("TLS");
				sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
				HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

				// Desactivar la verificación del hostname
				HostnameVerifier allHostsValid = (hostname, session) -> true;
				HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		}
	}


