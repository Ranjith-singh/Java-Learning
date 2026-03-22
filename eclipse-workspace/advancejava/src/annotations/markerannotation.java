package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//provides information for the compiler
//does some part of the work to reduce the stress on the processor

@Retention(RetentionPolicy.RUNTIME)//where it is called
@Target(ElementType.METHOD)		// what is called

public @interface markerannotation {	//marker annotation is a annotation which has no idea of the metadata
	int value();
}
