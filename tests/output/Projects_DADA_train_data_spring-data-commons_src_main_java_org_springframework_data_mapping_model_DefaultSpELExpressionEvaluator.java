<METHOD_START> public void ( java.lang.Object java.lang.Object , SpELContext org.springframework.data.mapping.model.SpELContext ) { this . java.lang.Object = java.lang.Object ; this . org.springframework.data.mapping.model.SpELContext = org.springframework.data.mapping.model.SpELContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T > T T ( java.lang.String java.lang.String ) { Expression org.springframework.data.mapping.model.Expression = org.springframework.data.mapping.model.SpELContext . getParser ( ) . parseExpression ( java.lang.String ) ; return ( T ) org.springframework.data.mapping.model.Expression . getValue ( org.springframework.data.mapping.model.SpELContext . getEvaluationContext ( java.lang.Object ) ) ; }  <METHOD_END>