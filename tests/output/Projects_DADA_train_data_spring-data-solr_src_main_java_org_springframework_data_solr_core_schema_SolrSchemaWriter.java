<METHOD_START> public void ( SolrClientFactory org.springframework.data.solr.core.schema.SolrClientFactory ) { this . org.springframework.data.solr.core.schema.SolrTemplate = new SolrTemplate ( org.springframework.data.solr.core.schema.SolrClientFactory ) ; }  <METHOD_END>
<METHOD_START> public void void ( SchemaDefinition org.springframework.data.solr.core.schema.SchemaDefinition ) { if ( boolean ( org.springframework.data.solr.core.schema.SchemaDefinition . getCollectionName ( ) ) ) { void ( org.springframework.data.solr.core.schema.SchemaDefinition ) ; return; } void ( org.springframework.data.solr.core.schema.SchemaDefinition ) ; }  <METHOD_END>
<METHOD_START> protected void void ( SchemaDefinition org.springframework.data.solr.core.schema.SchemaDefinition ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> protected void void ( SchemaDefinition org.springframework.data.solr.core.schema.SchemaDefinition ) { SchemaDefinition org.springframework.data.solr.core.schema.SchemaDefinition = org.springframework.data.solr.core.schema.SchemaDefinition ( org.springframework.data.solr.core.schema.SchemaDefinition . getCollectionName ( ) ) ; java.util.List<org.springframework.data.solr.core.schema.FieldDefinition> < FieldDefinition > java.util.List<org.springframework.data.solr.core.schema.FieldDefinition> = new java.util.ArrayList<org.springframework.data.solr.core.schema.FieldDefinition> <> ( ) ; for ( FieldDefinition org.springframework.data.solr.core.schema.FieldDefinition : org.springframework.data.solr.core.schema.SchemaDefinition . getFields ( ) ) { if ( ! org.springframework.data.solr.core.schema.SchemaDefinition . containsField ( org.springframework.data.solr.core.schema.FieldDefinition . getName ( ) ) ) java.util.List<org.springframework.data.solr.core.schema.FieldDefinition> . add ( org.springframework.data.solr.core.schema.FieldDefinition ) ; } void ( java.util.List<org.springframework.data.solr.core.schema.FieldDefinition> , org.springframework.data.solr.core.schema.SchemaDefinition . getCollectionName ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.Collection<org.springframework.data.solr.core.schema.FieldDefinition> < FieldDefinition > java.util.Collection<org.springframework.data.solr.core.schema.FieldDefinition> , java.lang.String java.lang.String ) { if ( ! CollectionUtils . isEmpty ( java.util.Collection<org.springframework.data.solr.core.schema.FieldDefinition> ) ) { SchemaOperations org.springframework.data.solr.core.schema.SchemaOperations = org.springframework.data.solr.core.schema.SolrTemplate . getSchemaOperations ( java.lang.String ) ; for ( FieldDefinition org.springframework.data.solr.core.schema.FieldDefinition : java.util.Collection<org.springframework.data.solr.core.schema.FieldDefinition> ) { org.springframework.data.solr.core.schema.SchemaOperations . addField ( org.springframework.data.solr.core.schema.FieldDefinition ) ; } } }  <METHOD_END>
<METHOD_START> boolean boolean ( java.lang.String java.lang.String ) { return ! java.lang.Double ( java.lang.String ) . boolean ( ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.solr.core.schema.SchemaDefinition org.springframework.data.solr.core.schema.SchemaDefinition ( java.lang.String java.lang.String ) { return org.springframework.data.solr.core.schema.SolrTemplate . getSchemaOperations ( java.lang.String ) . readSchema ( ) ; }  <METHOD_END>
<METHOD_START> java.lang.Double java.lang.Double ( java.lang.String java.lang.String ) { return org.springframework.data.solr.core.schema.SolrTemplate . getSchemaOperations ( java.lang.String ) . getSchemaVersion ( ) ; }  <METHOD_END>
