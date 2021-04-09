package p06.lecture.p8access_modifier;

public class A01AccessModifier {
	// Access Modifier (접근지정자, 접근제한자)
	// : 정의된 요소가 어디까지 접근 가능한지 명시해준다. 
	
	// Public, protected, (package private, default), private
	
	//									전체 		상속 		패키지 		자기자신
	// public							 O			  O			  O			   O
	// protected						 X 			  O			  O			   O
	// (package private, default)		 X			  X			  O			   O
	// private							 X			  X			  X			   O
}
