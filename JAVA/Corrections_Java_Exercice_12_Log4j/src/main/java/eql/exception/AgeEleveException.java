package eql.exception;

import org.slf4j.LoggerFactory;

import eql.java.Enseignant;

@SuppressWarnings({ "serial", "unused" })
public class AgeEleveException extends Exception{
	
	static org.slf4j.Logger Logger= LoggerFactory.getLogger(AgeEleveException.class);
	
	public AgeEleveException(String s) {
		super(s);
	}
	
	
}