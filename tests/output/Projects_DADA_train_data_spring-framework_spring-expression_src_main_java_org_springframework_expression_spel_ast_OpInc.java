<METHOD_START> public void ( int int , boolean boolean , SpelNodeImpl ... org.springframework.expression.spel.ast.SpelNodeImpl[] ) { super( STRING , int , org.springframework.expression.spel.ast.SpelNodeImpl[] ); this . boolean = boolean ; Assert . notEmpty ( org.springframework.expression.spel.ast.SpelNodeImpl[] , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.TypedValue org.springframework.expression.spel.ast.TypedValue ( ExpressionState org.springframework.expression.spel.ast.ExpressionState ) throws org.springframework.expression.spel.ast.EvaluationException { SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl = getLeftOperand ( ) ; ValueRef org.springframework.expression.spel.ast.ValueRef = org.springframework.expression.spel.ast.SpelNodeImpl . getValueRef ( org.springframework.expression.spel.ast.ExpressionState ) ; TypedValue org.springframework.expression.spel.ast.TypedValue = org.springframework.expression.spel.ast.ValueRef . getValue ( ) ; java.lang.Object java.lang.Object = org.springframework.expression.spel.ast.TypedValue . getValue ( ) ; TypedValue org.springframework.expression.spel.ast.TypedValue = org.springframework.expression.spel.ast.TypedValue ; TypedValue org.springframework.expression.spel.ast.TypedValue = null ; if ( java.lang.Object instanceof java.lang.Number ) { java.lang.Number java.lang.Number = ( java.lang.Number ) java.lang.Object ; if ( java.lang.Number instanceof java.math.BigDecimal ) { org.springframework.expression.spel.ast.TypedValue = new TypedValue ( ( ( java.math.BigDecimal ) java.lang.Number ) . java.math.BigDecimal ( java.math.BigDecimal . java.math.BigDecimal ) , org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) ) ; } else if ( java.lang.Number instanceof java.lang.Double ) { org.springframework.expression.spel.ast.TypedValue = new TypedValue ( java.lang.Number . double ( ) + NUMBER , org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) ) ; } else if ( java.lang.Number instanceof java.lang.Float ) { org.springframework.expression.spel.ast.TypedValue = new TypedValue ( java.lang.Number . float ( ) + NUMBER , org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) ) ; } else if ( java.lang.Number instanceof java.math.BigInteger ) { org.springframework.expression.spel.ast.TypedValue = new TypedValue ( ( ( java.math.BigInteger ) java.lang.Number ) . java.math.BigInteger ( java.math.BigInteger . java.math.BigInteger ) , org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) ) ; } else if ( java.lang.Number instanceof java.lang.Long ) { org.springframework.expression.spel.ast.TypedValue = new TypedValue ( java.lang.Number . long ( ) + NUMBER , org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) ) ; } else if ( java.lang.Number instanceof java.lang.Integer ) { org.springframework.expression.spel.ast.TypedValue = new TypedValue ( java.lang.Number . int ( ) + NUMBER , org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) ) ; } else if ( java.lang.Number instanceof java.lang.Short ) { org.springframework.expression.spel.ast.TypedValue = new TypedValue ( java.lang.Number . short ( ) + ( short ) NUMBER , org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) ) ; } else if ( java.lang.Number instanceof java.lang.Byte ) { org.springframework.expression.spel.ast.TypedValue = new TypedValue ( java.lang.Number . byte ( ) + ( byte ) NUMBER , org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) ) ; } else { org.springframework.expression.spel.ast.TypedValue = new TypedValue ( java.lang.Number . double ( ) + NUMBER , org.springframework.expression.spel.ast.TypedValue . getTypeDescriptor ( ) ) ; } } if ( org.springframework.expression.spel.ast.TypedValue == null ) { try { org.springframework.expression.spel.ast.TypedValue = org.springframework.expression.spel.ast.ExpressionState . operate ( Operation . ADD , org.springframework.expression.spel.ast.TypedValue . getValue ( ) , NUMBER ) ; } catch ( SpelEvaluationException org.springframework.expression.spel.ast.SpelEvaluationException ) { if ( org.springframework.expression.spel.ast.SpelEvaluationException . getMessageCode ( ) == SpelMessage . OPERATOR_NOT_SUPPORTED_BETWEEN_TYPES ) { throw new SpelEvaluationException ( org.springframework.expression.spel.ast.SpelNodeImpl . getStartPosition ( ) , SpelMessage . OPERAND_NOT_INCREMENTABLE , org.springframework.expression.spel.ast.SpelNodeImpl . toStringAST ( ) ) ; } throw org.springframework.expression.spel.ast.SpelEvaluationException ; } } try { org.springframework.expression.spel.ast.ValueRef . setValue ( org.springframework.expression.spel.ast.TypedValue . getValue ( ) ) ; } catch ( SpelEvaluationException org.springframework.expression.spel.ast.SpelEvaluationException ) { if ( org.springframework.expression.spel.ast.SpelEvaluationException . getMessageCode ( ) == SpelMessage . SETVALUE_NOT_SUPPORTED ) { throw new SpelEvaluationException ( org.springframework.expression.spel.ast.SpelNodeImpl . getStartPosition ( ) , SpelMessage . OPERAND_NOT_INCREMENTABLE ) ; } else { throw org.springframework.expression.spel.ast.SpelEvaluationException ; } } if ( ! this . boolean ) { org.springframework.expression.spel.ast.TypedValue = org.springframework.expression.spel.ast.TypedValue ; } return org.springframework.expression.spel.ast.TypedValue ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return getLeftOperand ( ) . toStringAST ( ) + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl ( ) { return null ; }  <METHOD_END>
