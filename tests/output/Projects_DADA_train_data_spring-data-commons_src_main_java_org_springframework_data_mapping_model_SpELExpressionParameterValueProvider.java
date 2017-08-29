<METHOD_START> public void ( SpELExpressionEvaluator org.springframework.data.mapping.model.SpELExpressionEvaluator , ConversionService org.springframework.data.mapping.model.ConversionService , ParameterValueProvider < P > org.springframework.data.mapping.model.ParameterValueProvider<P> ) { Assert . notNull ( org.springframework.data.mapping.model.SpELExpressionEvaluator , STRING ) ; Assert . notNull ( org.springframework.data.mapping.model.ConversionService , STRING ) ; Assert . notNull ( org.springframework.data.mapping.model.ParameterValueProvider<P> , STRING ) ; this . org.springframework.data.mapping.model.SpELExpressionEvaluator = org.springframework.data.mapping.model.SpELExpressionEvaluator ; this . org.springframework.data.mapping.model.ConversionService = org.springframework.data.mapping.model.ConversionService ; this . org.springframework.data.mapping.model.ParameterValueProvider<P> = org.springframework.data.mapping.model.ParameterValueProvider<P> ; }  <METHOD_END>
<METHOD_START> public < T > java.util.Optional<T> < T > java.util.Optional<T> ( Parameter < T , P > org.springframework.data.mapping.model.Parameter<T,P> ) { return org.springframework.data.mapping.model.Parameter<T,P> . getSpelExpression ( ) . map ( it -> Optional . ofNullable ( evaluator . evaluate ( it ) ) . map ( result -> potentiallyConvertSpelValue ( result , parameter ) ) ) . orElseGet ( ( ) delegate . getParameterValue ( parameter ) ) ; }  <METHOD_END>
<METHOD_START> protected < T > T T ( java.lang.Object java.lang.Object , Parameter < T , P > org.springframework.data.mapping.model.Parameter<T,P> ) { return org.springframework.data.mapping.model.ConversionService . convert ( java.lang.Object , org.springframework.data.mapping.model.Parameter<T,P> . getRawType ( ) ) ; }  <METHOD_END>
