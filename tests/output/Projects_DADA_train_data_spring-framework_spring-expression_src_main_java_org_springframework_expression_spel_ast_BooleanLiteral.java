<METHOD_START> public void ( java.lang.String java.lang.String , int int , boolean boolean ) { super( java.lang.String , int ); this . org.springframework.expression.spel.ast.BooleanTypedValue = BooleanTypedValue . forValue ( boolean ) ; this . exitTypeDescriptor = STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.BooleanTypedValue org.springframework.expression.spel.ast.BooleanTypedValue ( ) { return this . org.springframework.expression.spel.ast.BooleanTypedValue ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MethodVisitor org.springframework.expression.spel.ast.MethodVisitor , CodeFlow org.springframework.expression.spel.ast.CodeFlow ) { if ( this . org.springframework.expression.spel.ast.BooleanTypedValue == BooleanTypedValue . TRUE ) { org.springframework.expression.spel.ast.MethodVisitor . visitLdcInsn ( NUMBER ) ; } else { org.springframework.expression.spel.ast.MethodVisitor . visitLdcInsn ( NUMBER ) ; } org.springframework.expression.spel.ast.CodeFlow . pushDescriptor ( this . exitTypeDescriptor ) ; }  <METHOD_END>