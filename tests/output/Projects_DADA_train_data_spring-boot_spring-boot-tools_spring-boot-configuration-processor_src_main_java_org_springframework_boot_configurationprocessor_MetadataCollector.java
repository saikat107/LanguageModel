<METHOD_START> public void ( javax.annotation.processing.ProcessingEnvironment javax.annotation.processing.ProcessingEnvironment , ConfigurationMetadata org.springframework.boot.configurationprocessor.ConfigurationMetadata ) { this . javax.annotation.processing.ProcessingEnvironment = javax.annotation.processing.ProcessingEnvironment ; this . org.springframework.boot.configurationprocessor.ConfigurationMetadata = org.springframework.boot.configurationprocessor.ConfigurationMetadata ; this . org.springframework.boot.configurationprocessor.TypeUtils = new TypeUtils ( javax.annotation.processing.ProcessingEnvironment ) ; }  <METHOD_END>
<METHOD_START> public void void ( javax.annotation.processing.RoundEnvironment javax.annotation.processing.RoundEnvironment ) { for ( javax.lang.model.element.Element javax.lang.model.element.Element : javax.annotation.processing.RoundEnvironment . java.util.Set<? extends javax.lang.model.element.Element> ( ) ) { void ( javax.lang.model.element.Element ) ; } }  <METHOD_END>
<METHOD_START> private void void ( javax.lang.model.element.Element javax.lang.model.element.Element ) { if ( javax.lang.model.element.Element instanceof javax.lang.model.element.TypeElement ) { this . java.util.Set<java.lang.String> . boolean ( this . org.springframework.boot.configurationprocessor.TypeUtils . getQualifiedName ( javax.lang.model.element.Element ) ) ; } }  <METHOD_END>
<METHOD_START> public void void ( ItemMetadata org.springframework.boot.configurationprocessor.ItemMetadata ) { this . java.util.List<org.springframework.boot.configurationprocessor.ItemMetadata> . add ( org.springframework.boot.configurationprocessor.ItemMetadata ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ItemMetadata org.springframework.boot.configurationprocessor.ItemMetadata ) { if ( ! org.springframework.boot.configurationprocessor.ItemMetadata . isOfItemType ( ItemMetadata . ItemType . GROUP ) ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.boot.configurationprocessor.ItemMetadata + STRING ) ; } for ( ItemMetadata org.springframework.boot.configurationprocessor.ItemMetadata : this . java.util.List<org.springframework.boot.configurationprocessor.ItemMetadata> ) { if ( org.springframework.boot.configurationprocessor.ItemMetadata . isOfItemType ( ItemMetadata . ItemType . GROUP ) && org.springframework.boot.configurationprocessor.ItemMetadata . getName ( ) . equals ( org.springframework.boot.configurationprocessor.ItemMetadata . getName ( ) ) && org.springframework.boot.configurationprocessor.ItemMetadata . getType ( ) . equals ( org.springframework.boot.configurationprocessor.ItemMetadata . getType ( ) ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.configurationprocessor.ConfigurationMetadata org.springframework.boot.configurationprocessor.ConfigurationMetadata ( ) { ConfigurationMetadata org.springframework.boot.configurationprocessor.ConfigurationMetadata = new ConfigurationMetadata ( ) ; for ( ItemMetadata org.springframework.boot.configurationprocessor.ItemMetadata : this . java.util.List<org.springframework.boot.configurationprocessor.ItemMetadata> ) { org.springframework.boot.configurationprocessor.ConfigurationMetadata . add ( org.springframework.boot.configurationprocessor.ItemMetadata ) ; } if ( this . org.springframework.boot.configurationprocessor.ConfigurationMetadata != null ) { java.util.List<org.springframework.boot.configurationprocessor.ItemMetadata> < ItemMetadata > java.util.List<org.springframework.boot.configurationprocessor.ItemMetadata> = this . org.springframework.boot.configurationprocessor.ConfigurationMetadata . getItems ( ) ; for ( ItemMetadata org.springframework.boot.configurationprocessor.ItemMetadata : java.util.List<org.springframework.boot.configurationprocessor.ItemMetadata> ) { if ( boolean ( org.springframework.boot.configurationprocessor.ItemMetadata ) ) { org.springframework.boot.configurationprocessor.ConfigurationMetadata . add ( org.springframework.boot.configurationprocessor.ItemMetadata ) ; } } } return org.springframework.boot.configurationprocessor.ConfigurationMetadata ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ItemMetadata org.springframework.boot.configurationprocessor.ItemMetadata ) { java.lang.String java.lang.String = org.springframework.boot.configurationprocessor.ItemMetadata . getSourceType ( ) ; return ( java.lang.String != null && ! boolean ( java.lang.String ) && ! boolean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String ) { return this . javax.annotation.processing.ProcessingEnvironment . javax.lang.model.util.Elements ( ) . javax.lang.model.element.TypeElement ( java.lang.String ) == null ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String ) { return this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; }  <METHOD_END>
