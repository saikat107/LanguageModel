<METHOD_START> public void ( ExposedFields org.springframework.data.mongodb.core.aggregation.ExposedFields , AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { super( org.springframework.data.mongodb.core.aggregation.ExposedFields , org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ); this . org.springframework.data.mongodb.core.aggregation.AggregationOperationContext = org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.mongodb.core.aggregation.FieldReference org.springframework.data.mongodb.core.aggregation.FieldReference ( Field org.springframework.data.mongodb.core.aggregation.Field , java.lang.String java.lang.String ) { FieldReference org.springframework.data.mongodb.core.aggregation.FieldReference = super. resolveExposedField ( org.springframework.data.mongodb.core.aggregation.Field , java.lang.String ) ; if ( org.springframework.data.mongodb.core.aggregation.FieldReference != null ) { return org.springframework.data.mongodb.core.aggregation.FieldReference ; } if ( org.springframework.data.mongodb.core.aggregation.Field != null ) { return org.springframework.data.mongodb.core.aggregation.AggregationOperationContext . getReference ( org.springframework.data.mongodb.core.aggregation.Field ) ; } return org.springframework.data.mongodb.core.aggregation.AggregationOperationContext . getReference ( java.lang.String ) ; }  <METHOD_END>