<METHOD_START> public void ( java.lang.String java.lang.String , int int , float float ) { super( java.lang.String , int ); this . org.springframework.expression.spel.ast.TypedValue = new TypedValue ( float ) ; this . exitTypeDescriptor = STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.TypedValue org.springframework.expression.spel.ast.TypedValue ( ) { return this . org.springframework.expression.spel.ast.TypedValue ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MethodVisitor org.springframework.expression.spel.ast.MethodVisitor , CodeFlow org.springframework.expression.spel.ast.CodeFlow ) { org.springframework.expression.spel.ast.MethodVisitor . visitLdcInsn ( this . org.springframework.expression.spel.ast.TypedValue . getValue ( ) ) ; org.springframework.expression.spel.ast.CodeFlow . pushDescriptor ( this . exitTypeDescriptor ) ; }  <METHOD_END>
