<METHOD_START> public void ( Validator org.springframework.data.mongodb.core.mapping.event.Validator ) { Assert . notNull ( org.springframework.data.mongodb.core.mapping.event.Validator , STRING ) ; this . org.springframework.data.mongodb.core.mapping.event.Validator = org.springframework.data.mongodb.core.mapping.event.Validator ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ java.lang.Override public void void ( BeforeSaveEvent < java.lang.Object > org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent<java.lang.Object> ) { org.springframework.data.mongodb.core.mapping.event.Logger . debug ( STRING , org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent<java.lang.Object> . getSource ( ) ) ; java.util.Set java.util.Set = org.springframework.data.mongodb.core.mapping.event.Validator . validate ( org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent<java.lang.Object> . getSource ( ) ) ; if ( ! java.util.Set . boolean ( ) ) { org.springframework.data.mongodb.core.mapping.event.Logger . info ( STRING , org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent<java.lang.Object> . getSource ( ) , java.util.Set ) ; throw new ConstraintViolationException ( java.util.Set ) ; } }  <METHOD_END>