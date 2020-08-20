package trabalho;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class GeraChaves {
	
	public KeyPair geraChaves() throws NoSuchAlgorithmException, InvalidKeyException {
		// Gera��o das chaves p�blicas e privadas
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("DSA"); // Gera as chaves
		SecureRandom secRan = new SecureRandom();					// Obter um n�mero aleat�rio
		kpg.initialize(512, secRan);								// Inicializa as chaves
		KeyPair keyP = kpg.generateKeyPair();						// V�riavel criada para extrair as chaves p�blica e privada da outra variavel
		
		return keyP;
	}
}
