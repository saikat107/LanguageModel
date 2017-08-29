<METHOD_START> public void ( int int , SpelNodeImpl ... org.springframework.expression.spel.ast.SpelNodeImpl[] ) { super( STRING , int , org.springframework.expression.spel.ast.SpelNodeImpl[] ); Assert . notEmpty ( org.springframework.expression.spel.ast.SpelNodeImpl[] , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.TypedValue org.springframework.expression.spel.ast.TypedValue ( ExpressionState org.springframework.expression.spel.ast.ExpressionState ) throws org.springframework.expression.spel.ast.EvaluationException { SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl = getLeftOperand ( ) ; SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl = org.springframework.expression.spel.ast.SpelNodeImpl ( ) ; if ( org.springframework.expression.spel.ast.SpelNodeImpl == null ) { java.lang.Object java.lang.Object = org.springframework.expression.spel.ast.SpelNodeImpl . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) . getValue ( ) ; if ( java.lang.Object instanceof java.lang.Number ) { if ( java.lang.Object instanceof java.lang.Double ) { this . exitTypeDescriptor = STRING ; } else if ( java.lang.Object instanceof java.lang.Float ) { this . exitTypeDescriptor = STRING ; } else if ( java.lang.Object instanceof java.lang.Long ) { this . exitTypeDescriptor = STRING ; } else if ( java.lang.Object instanceof java.lang.Integer ) { this . exitTypeDescriptor = STRING ; } return new TypedValue ( java.lang.Object ) ; } return org.springframework.expression.spel.ast.ExpressionState . operate ( Operation . ADD , java.lang.Object , null ) ; } TypedValue org.springframework.expression.spel.ast.TypedValue = org.springframework.expression.spel.ast.SpelNodeImpl . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) ; java.lang.Object java.lang.Object = org.springframework.expression.spel.ast.TypedValue . getValue ( ) ; TypedValue org.springframework.expression.spel.ast.TypedValue = org.springframework.expression.spel.ast.SpelNodeImpl . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) ; java.lang.Object java.lang.Object = org.springframework.expression.spel.ast.TypedValue . getValue ( ) ; if ( java.lang.Object instanceof java.lang.Number && java.lang.Object instanceof java.lang.Number ) { java.lang.Number java.lang.Number = ( java.lang.Number ) java.lang.Object ; java.lang.Number java.lang.Number = ( java.lang.Number ) java.lang.Object ; if ( java.lang.Number instanceof java.math.BigDecimal || java.lang.Number instanceof java.math.BigDecimal ) { java.math.BigDecimal java.math.BigDecimal = NumberUtils . convertNumberToTargetClass ( java.lang.Number , java.math.BigDecimal .class ) ; java.math.BigDecimal java.math.BigDecimal = NumberUtils . convertNumberToTargetClass ( java.lang.Number , java.math.BigDecimal .class ) ; return new TypedValue ( java.math.BigDecimal . java.math.BigDecimal ( java.math.BigDecimal ) ) ; } else if ( java.lang.Number instanceof java.lang.Double || java.lang.Number instanceof java.lang.Double ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( java.lang.Number . double ( ) + java.lang.Number . double ( ) ) ; } else if ( java.lang.Number instanceof java.lang.Float || java.lang.Number instanceof java.lang.Float ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( java.lang.Number . float ( ) + java.lang.Number . float ( ) ) ; } else if ( java.lang.Number instanceof java.math.BigInteger || java.lang.Number instanceof java.math.BigInteger ) { java.math.BigInteger java.math.BigInteger = NumberUtils . convertNumberToTargetClass ( java.lang.Number , java.math.BigInteger .class ) ; java.math.BigInteger java.math.BigInteger = NumberUtils . convertNumberToTargetClass ( java.lang.Number , java.math.BigInteger .class ) ; return new TypedValue ( java.math.BigInteger . java.math.BigInteger ( java.math.BigInteger ) ) ; } else if ( java.lang.Number instanceof java.lang.Long || java.lang.Number instanceof java.lang.Long ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( java.lang.Number . long ( ) + java.lang.Number . long ( ) ) ; } else if ( CodeFlow . isIntegerForNumericOp ( java.lang.Number ) || CodeFlow . isIntegerForNumericOp ( java.lang.Number ) ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( java.lang.Number . int ( ) + java.lang.Number . int ( ) ) ; } else { return new TypedValue ( java.lang.Number . double ( ) + java.lang.Number . double ( ) ) ; } } if ( java.lang.Object instanceof java.lang.String && java.lang.Object instanceof java.lang.String ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( ( java.lang.String ) java.lang.Object + java.lang.Object ) ; } if ( java.lang.Object instanceof java.lang.String ) { return new TypedValue ( java.lang.Object + ( java.lang.Object == null ? STRING : java.lang.String ( org.springframework.expression.spel.ast.TypedValue , org.springframework.expression.spel.ast.ExpressionState ) ) ) ; } if ( java.lang.Object instanceof java.lang.String ) { return new TypedValue ( ( java.lang.Object == null ? STRING : java.lang.String ( org.springframework.expression.spel.ast.TypedValue , org.springframework.expression.spel.ast.ExpressionState ) ) + java.lang.Object ) ; } return org.springframework.expression.spel.ast.ExpressionState . operate ( Operation . ADD , java.lang.Object , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { if ( this . children . length < NUMBER ) { return STRING + getLeftOperand ( ) . toStringAST ( ) ; } return super. toStringAST ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl ( ) { if ( this . children . length < NUMBER ) { return null ; } return this . children [ NUMBER ] ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( TypedValue org.springframework.expression.spel.ast.TypedValue , ExpressionState org.springframework.expression.spel.ast.ExpressionState ) { TypeConverter org.springframework.expression.spel.ast.TypeConverter = org.springframework.expression.spel.ast.ExpressionState . getEvaluationContext ( ) . getTypeConverter ( ) ; TypeDescriptor org.springframework.expression.spel.ast.TypeDescriptor = TypeDescriptor . valueOf ( java.lang.String .class ) ; if ( org.springframework.expression.spel.ast.TypeConverter . canConvert ( org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) , org.springframework.expression.spel.ast.TypeDescriptor ) ) { return java.lang.String . java.lang.String ( org.springframework.expression.spel.ast.TypeConverter . convertValue ( org.springframework.expression.spel.ast.TypedValue . getValue ( ) , org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) , org.springframework.expression.spel.ast.TypeDescriptor ) ) ; } return java.lang.String . java.lang.String ( org.springframework.expression.spel.ast.TypedValue . getValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { if ( ! getLeftOperand ( ) . isCompilable ( ) ) { return false ; } if ( this . children . length > NUMBER ) { if ( ! org.springframework.expression.spel.ast.SpelNodeImpl ( ) . isCompilable ( ) ) { return false ; } } return ( this . exitTypeDescriptor != null ) ; }  <METHOD_END>
<METHOD_START> private void void ( MethodVisitor org.springframework.expression.spel.ast.MethodVisitor , CodeFlow org.springframework.expression.spel.ast.CodeFlow , SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl ) { if ( org.springframework.expression.spel.ast.SpelNodeImpl instanceof org.springframework.expression.spel.ast.OpPlus ) { org.springframework.expression.spel.ast.OpPlus org.springframework.expression.spel.ast.OpPlus = ( org.springframework.expression.spel.ast.OpPlus ) org.springframework.expression.spel.ast.SpelNodeImpl ; void ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow , org.springframework.expression.spel.ast.OpPlus . getLeftOperand ( ) ) ; void ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow , org.springframework.expression.spel.ast.OpPlus . org.springframework.expression.spel.ast.SpelNodeImpl ( ) ) ; } else { org.springframework.expression.spel.ast.CodeFlow . enterCompilationScope ( ) ; org.springframework.expression.spel.ast.SpelNodeImpl . generateCode ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow ) ; if ( ! STRING . boolean ( org.springframework.expression.spel.ast.CodeFlow . lastDescriptor ( ) ) ) { org.springframework.expression.spel.ast.MethodVisitor . visitTypeInsn ( CHECKCAST , STRING ) ; } org.springframework.expression.spel.ast.CodeFlow . exitCompilationScope ( ) ; org.springframework.expression.spel.ast.MethodVisitor . visitMethodInsn ( INVOKEVIRTUAL , STRING , STRING , STRING , false ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MethodVisitor org.springframework.expression.spel.ast.MethodVisitor , CodeFlow org.springframework.expression.spel.ast.CodeFlow ) { if ( this . exitTypeDescriptor == STRING ) { org.springframework.expression.spel.ast.MethodVisitor . visitTypeInsn ( NEW , STRING ) ; org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( DUP ) ; org.springframework.expression.spel.ast.MethodVisitor . visitMethodInsn ( INVOKESPECIAL , STRING , STRING , STRING , false ) ; void ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow , getLeftOperand ( ) ) ; void ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow , org.springframework.expression.spel.ast.SpelNodeImpl ( ) ) ; org.springframework.expression.spel.ast.MethodVisitor . visitMethodInsn ( INVOKEVIRTUAL , STRING , STRING , STRING , false ) ; } else { getLeftOperand ( ) . generateCode ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow ) ; java.lang.String java.lang.String = getLeftOperand ( ) . exitTypeDescriptor ; CodeFlow . insertNumericUnboxOrPrimitiveTypeCoercion ( org.springframework.expression.spel.ast.MethodVisitor , java.lang.String , this . exitTypeDescriptor . charAt ( NUMBER ) ) ; if ( this . children . length > NUMBER ) { org.springframework.expression.spel.ast.CodeFlow . enterCompilationScope ( ) ; org.springframework.expression.spel.ast.SpelNodeImpl ( ) . generateCode ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow ) ; java.lang.String java.lang.String = org.springframework.expression.spel.ast.SpelNodeImpl ( ) . exitTypeDescriptor ; org.springframework.expression.spel.ast.CodeFlow . exitCompilationScope ( ) ; CodeFlow . insertNumericUnboxOrPrimitiveTypeCoercion ( org.springframework.expression.spel.ast.MethodVisitor , java.lang.String , this . exitTypeDescriptor . charAt ( NUMBER ) ) ; switch ( this . exitTypeDescriptor . charAt ( NUMBER ) ) { case 'I' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( IADD ) ; break; case 'J' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( LADD ) ; break; case 'F' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( FADD ) ; break; case 'D' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( DADD ) ; break; default: throw new java.lang.IllegalStateException ( STRING + this . exitTypeDescriptor + STRING ) ; } } } org.springframework.expression.spel.ast.CodeFlow . pushDescriptor ( this . exitTypeDescriptor ) ; }  <METHOD_END>
