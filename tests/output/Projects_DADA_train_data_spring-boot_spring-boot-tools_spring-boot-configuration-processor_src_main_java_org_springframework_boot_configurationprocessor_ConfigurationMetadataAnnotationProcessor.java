<METHOD_START> protected java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public javax.lang.model.SourceVersion javax.lang.model.SourceVersion ( ) { return javax.lang.model.SourceVersion . javax.lang.model.SourceVersion ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public synchronized void void ( javax.annotation.processing.ProcessingEnvironment javax.annotation.processing.ProcessingEnvironment ) { super. void ( javax.annotation.processing.ProcessingEnvironment ) ; this . org.springframework.boot.configurationprocessor.TypeUtils = new TypeUtils ( javax.annotation.processing.ProcessingEnvironment ) ; this . org.springframework.boot.configurationprocessor.MetadataStore = new MetadataStore ( javax.annotation.processing.ProcessingEnvironment ) ; this . org.springframework.boot.configurationprocessor.MetadataCollector = new MetadataCollector ( javax.annotation.processing.ProcessingEnvironment , this . org.springframework.boot.configurationprocessor.MetadataStore . readMetadata ( ) ) ; try { this . org.springframework.boot.configurationprocessor.FieldValuesParser = new JavaCompilerFieldValuesParser ( javax.annotation.processing.ProcessingEnvironment ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { this . org.springframework.boot.configurationprocessor.FieldValuesParser = FieldValuesParser . NONE ; void ( STRING + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.util.Set<? extends javax.lang.model.element.TypeElement> < ? extends javax.lang.model.element.TypeElement > java.util.Set<? extends javax.lang.model.element.TypeElement> , javax.annotation.processing.RoundEnvironment javax.annotation.processing.RoundEnvironment ) { this . org.springframework.boot.configurationprocessor.MetadataCollector . processing ( javax.annotation.processing.RoundEnvironment ) ; javax.lang.model.util.Elements javax.lang.model.util.Elements = this . javax.annotation.processing.ProcessingEnvironment . javax.lang.model.util.Elements ( ) ; javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement = javax.lang.model.util.Elements . javax.lang.model.element.TypeElement ( java.lang.String ( ) ) ; if ( javax.lang.model.element.TypeElement != null ) { for ( javax.lang.model.element.Element javax.lang.model.element.Element : javax.annotation.processing.RoundEnvironment . java.util.Set<? extends javax.lang.model.element.Element> ( javax.lang.model.element.TypeElement ) ) { void ( javax.lang.model.element.Element ) ; } } if ( javax.annotation.processing.RoundEnvironment . boolean ( ) ) { try { org.springframework.boot.configurationprocessor.ConfigurationMetadata ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Exception ) ; } } return false ; }  <METHOD_END>
<METHOD_START> private void void ( javax.lang.model.element.Element javax.lang.model.element.Element ) { try { javax.lang.model.element.AnnotationMirror javax.lang.model.element.AnnotationMirror = javax.lang.model.element.AnnotationMirror ( javax.lang.model.element.Element , java.lang.String ( ) ) ; if ( javax.lang.model.element.AnnotationMirror != null ) { java.lang.String java.lang.String = java.lang.String ( javax.lang.model.element.AnnotationMirror ) ; if ( javax.lang.model.element.Element instanceof javax.lang.model.element.TypeElement ) { void ( java.lang.String , ( javax.lang.model.element.TypeElement ) javax.lang.model.element.Element ) ; } else if ( javax.lang.model.element.Element instanceof javax.lang.model.element.ExecutableElement ) { void ( java.lang.String , ( javax.lang.model.element.ExecutableElement ) javax.lang.model.element.Element ) ; } } } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING + javax.lang.model.element.Element , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement ) { java.lang.String java.lang.String = this . org.springframework.boot.configurationprocessor.TypeUtils . getQualifiedName ( javax.lang.model.element.TypeElement ) ; this . org.springframework.boot.configurationprocessor.MetadataCollector . add ( ItemMetadata . newGroup ( java.lang.String , java.lang.String , java.lang.String , null ) ) ; void ( java.lang.String , javax.lang.model.element.TypeElement , null ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement ) { if ( javax.lang.model.element.ExecutableElement . java.util.Set<javax.lang.model.element.Modifier> ( ) . boolean ( javax.lang.model.element.Modifier . javax.lang.model.element.Modifier ) && ( javax.lang.model.type.TypeKind . javax.lang.model.type.TypeKind != javax.lang.model.element.ExecutableElement . javax.lang.model.type.TypeMirror ( ) . javax.lang.model.type.TypeKind ( ) ) ) { javax.lang.model.element.Element javax.lang.model.element.Element = this . javax.annotation.processing.ProcessingEnvironment . javax.lang.model.util.Types ( ) . javax.lang.model.element.Element ( javax.lang.model.element.ExecutableElement . javax.lang.model.type.TypeMirror ( ) ) ; if ( javax.lang.model.element.Element instanceof javax.lang.model.element.TypeElement ) { ItemMetadata org.springframework.boot.configurationprocessor.ItemMetadata = ItemMetadata . newGroup ( java.lang.String , this . org.springframework.boot.configurationprocessor.TypeUtils . getQualifiedName ( javax.lang.model.element.Element ) , this . org.springframework.boot.configurationprocessor.TypeUtils . getQualifiedName ( javax.lang.model.element.ExecutableElement . javax.lang.model.element.Element ( ) ) , javax.lang.model.element.ExecutableElement . java.lang.String ( ) ) ; if ( this . org.springframework.boot.configurationprocessor.MetadataCollector . hasSimilarGroup ( org.springframework.boot.configurationprocessor.ItemMetadata ) ) { this . javax.annotation.processing.ProcessingEnvironment . javax.annotation.processing.Messager ( ) . void ( javax.tools.Diagnostic.Kind . javax.tools.Diagnostic.Kind , STRING + java.lang.String + STRING , javax.lang.model.element.ExecutableElement ) ; } else { this . org.springframework.boot.configurationprocessor.MetadataCollector . add ( org.springframework.boot.configurationprocessor.ItemMetadata ) ; void ( java.lang.String , ( javax.lang.model.element.TypeElement ) javax.lang.model.element.Element , javax.lang.model.element.ExecutableElement ) ; } } } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement ) { TypeElementMembers org.springframework.boot.configurationprocessor.TypeElementMembers = new TypeElementMembers ( this . javax.annotation.processing.ProcessingEnvironment , this . org.springframework.boot.configurationprocessor.FieldValuesParser , javax.lang.model.element.TypeElement ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.configurationprocessor.TypeElementMembers . getFieldValues ( ) ; void ( java.lang.String , javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement , org.springframework.boot.configurationprocessor.TypeElementMembers , java.util.Map<java.lang.String,java.lang.Object> ) ; void ( java.lang.String , javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement , org.springframework.boot.configurationprocessor.TypeElementMembers , java.util.Map<java.lang.String,java.lang.Object> ) ; void ( java.lang.String , javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement , org.springframework.boot.configurationprocessor.TypeElementMembers ) ; void ( java.lang.String , javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement , org.springframework.boot.configurationprocessor.TypeElementMembers ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement , TypeElementMembers org.springframework.boot.configurationprocessor.TypeElementMembers , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,javax.lang.model.element.ExecutableElement> < java.lang.String , javax.lang.model.element.ExecutableElement > java.util.Map.Entry<java.lang.String,javax.lang.model.element.ExecutableElement> : org.springframework.boot.configurationprocessor.TypeElementMembers . getPublicGetters ( ) . entrySet ( ) ) { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,javax.lang.model.element.ExecutableElement> . java.lang.String ( ) ; javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement = java.util.Map.Entry<java.lang.String,javax.lang.model.element.ExecutableElement> . javax.lang.model.element.ExecutableElement ( ) ; javax.lang.model.type.TypeMirror javax.lang.model.type.TypeMirror = javax.lang.model.element.ExecutableElement . javax.lang.model.type.TypeMirror ( ) ; javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement = org.springframework.boot.configurationprocessor.TypeElementMembers . getPublicSetter ( java.lang.String , javax.lang.model.type.TypeMirror ) ; javax.lang.model.element.VariableElement javax.lang.model.element.VariableElement = org.springframework.boot.configurationprocessor.TypeElementMembers . getFields ( ) . get ( java.lang.String ) ; javax.lang.model.element.Element javax.lang.model.element.Element = this . javax.annotation.processing.ProcessingEnvironment . javax.lang.model.util.Types ( ) . javax.lang.model.element.Element ( javax.lang.model.type.TypeMirror ) ; boolean boolean = this . org.springframework.boot.configurationprocessor.TypeExcludeFilter . isExcluded ( javax.lang.model.type.TypeMirror ) ; boolean boolean = boolean ( javax.lang.model.element.Element , javax.lang.model.element.VariableElement , javax.lang.model.element.TypeElement ) ; boolean boolean = this . org.springframework.boot.configurationprocessor.TypeUtils . isCollectionOrMap ( javax.lang.model.type.TypeMirror ) ; if ( ! boolean && ! boolean && ( javax.lang.model.element.ExecutableElement != null || boolean ) ) { java.lang.String java.lang.String = this . org.springframework.boot.configurationprocessor.TypeUtils . getType ( javax.lang.model.type.TypeMirror ) ; java.lang.String java.lang.String = this . org.springframework.boot.configurationprocessor.TypeUtils . getQualifiedName ( javax.lang.model.element.TypeElement ) ; java.lang.String java.lang.String = this . org.springframework.boot.configurationprocessor.TypeUtils . getJavaDoc ( javax.lang.model.element.VariableElement ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; boolean boolean = boolean ( javax.lang.model.element.ExecutableElement ) || boolean ( javax.lang.model.element.ExecutableElement ) || boolean ( javax.lang.model.element.ExecutableElement ) ; this . org.springframework.boot.configurationprocessor.MetadataCollector . add ( ItemMetadata . newProperty ( java.lang.String , java.lang.String , java.lang.String , java.lang.String , null , java.lang.String , java.lang.Object , ( boolean ? org.springframework.boot.configurationprocessor.ItemDeprecation ( javax.lang.model.element.ExecutableElement ) : null ) ) ) ; } } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.configurationprocessor.ItemDeprecation org.springframework.boot.configurationprocessor.ItemDeprecation ( javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement ) { javax.lang.model.element.AnnotationMirror javax.lang.model.element.AnnotationMirror = javax.lang.model.element.AnnotationMirror ( javax.lang.model.element.ExecutableElement , java.lang.String ( ) ) ; java.lang.String java.lang.String = null ; java.lang.String java.lang.String = null ; if ( javax.lang.model.element.AnnotationMirror != null ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( javax.lang.model.element.AnnotationMirror ) ; java.lang.String = ( java.lang.String ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; java.lang.String = ( java.lang.String ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; } return new ItemDeprecation ( ( STRING . boolean ( java.lang.String ) ? null : java.lang.String ) , ( STRING . boolean ( java.lang.String ) ? null : java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement , TypeElementMembers org.springframework.boot.configurationprocessor.TypeElementMembers , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,javax.lang.model.element.VariableElement> < java.lang.String , javax.lang.model.element.VariableElement > java.util.Map.Entry<java.lang.String,javax.lang.model.element.VariableElement> : org.springframework.boot.configurationprocessor.TypeElementMembers . getFields ( ) . entrySet ( ) ) { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,javax.lang.model.element.VariableElement> . java.lang.String ( ) ; javax.lang.model.element.VariableElement javax.lang.model.element.VariableElement = java.util.Map.Entry<java.lang.String,javax.lang.model.element.VariableElement> . javax.lang.model.element.VariableElement ( ) ; if ( ! boolean ( javax.lang.model.element.VariableElement , javax.lang.model.element.TypeElement ) ) { continue; } javax.lang.model.type.TypeMirror javax.lang.model.type.TypeMirror = javax.lang.model.element.VariableElement . javax.lang.model.type.TypeMirror ( ) ; javax.lang.model.element.Element javax.lang.model.element.Element = this . javax.annotation.processing.ProcessingEnvironment . javax.lang.model.util.Types ( ) . javax.lang.model.element.Element ( javax.lang.model.type.TypeMirror ) ; boolean boolean = this . org.springframework.boot.configurationprocessor.TypeExcludeFilter . isExcluded ( javax.lang.model.type.TypeMirror ) ; boolean boolean = boolean ( javax.lang.model.element.Element , javax.lang.model.element.VariableElement , javax.lang.model.element.TypeElement ) ; boolean boolean = this . org.springframework.boot.configurationprocessor.TypeUtils . isCollectionOrMap ( javax.lang.model.type.TypeMirror ) ; boolean boolean = boolean ( javax.lang.model.element.VariableElement , javax.lang.model.element.TypeElement ) ; if ( ! boolean && ! boolean && ( boolean || boolean ) ) { java.lang.String java.lang.String = this . org.springframework.boot.configurationprocessor.TypeUtils . getType ( javax.lang.model.type.TypeMirror ) ; java.lang.String java.lang.String = this . org.springframework.boot.configurationprocessor.TypeUtils . getQualifiedName ( javax.lang.model.element.TypeElement ) ; java.lang.String java.lang.String = this . org.springframework.boot.configurationprocessor.TypeUtils . getJavaDoc ( javax.lang.model.element.VariableElement ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; boolean boolean = boolean ( javax.lang.model.element.VariableElement ) || boolean ( javax.lang.model.element.ExecutableElement ) ; this . org.springframework.boot.configurationprocessor.MetadataCollector . add ( ItemMetadata . newProperty ( java.lang.String , java.lang.String , java.lang.String , java.lang.String , null , java.lang.String , java.lang.Object , ( boolean ? new ItemDeprecation ( ) : null ) ) ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement , TypeElementMembers org.springframework.boot.configurationprocessor.TypeElementMembers ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,javax.lang.model.element.ExecutableElement> < java.lang.String , javax.lang.model.element.ExecutableElement > java.util.Map.Entry<java.lang.String,javax.lang.model.element.ExecutableElement> : org.springframework.boot.configurationprocessor.TypeElementMembers . getPublicGetters ( ) . entrySet ( ) ) { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,javax.lang.model.element.ExecutableElement> . java.lang.String ( ) ; javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement = java.util.Map.Entry<java.lang.String,javax.lang.model.element.ExecutableElement> . javax.lang.model.element.ExecutableElement ( ) ; javax.lang.model.element.VariableElement javax.lang.model.element.VariableElement = org.springframework.boot.configurationprocessor.TypeElementMembers . getFields ( ) . get ( java.lang.String ) ; void ( java.lang.String , javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement , java.lang.String , javax.lang.model.element.ExecutableElement , javax.lang.model.element.VariableElement , javax.lang.model.element.ExecutableElement . javax.lang.model.type.TypeMirror ( ) ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement , TypeElementMembers org.springframework.boot.configurationprocessor.TypeElementMembers ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,javax.lang.model.element.VariableElement> < java.lang.String , javax.lang.model.element.VariableElement > java.util.Map.Entry<java.lang.String,javax.lang.model.element.VariableElement> : org.springframework.boot.configurationprocessor.TypeElementMembers . getFields ( ) . entrySet ( ) ) { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,javax.lang.model.element.VariableElement> . java.lang.String ( ) ; javax.lang.model.element.VariableElement javax.lang.model.element.VariableElement = java.util.Map.Entry<java.lang.String,javax.lang.model.element.VariableElement> . javax.lang.model.element.VariableElement ( ) ; if ( boolean ( javax.lang.model.element.VariableElement , javax.lang.model.element.TypeElement ) ) { void ( java.lang.String , javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement , java.lang.String , null , javax.lang.model.element.VariableElement , javax.lang.model.element.VariableElement . javax.lang.model.type.TypeMirror ( ) ) ; } } }  <METHOD_END>
<METHOD_START> private boolean boolean ( javax.lang.model.element.VariableElement javax.lang.model.element.VariableElement , javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement ) { return boolean ( javax.lang.model.element.VariableElement , java.lang.String ) || boolean ( javax.lang.model.element.TypeElement , java.lang.String ) || boolean ( javax.lang.model.element.TypeElement , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( javax.lang.model.element.VariableElement javax.lang.model.element.VariableElement , javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement ) { return ! javax.lang.model.element.VariableElement . java.util.Set<javax.lang.model.element.Modifier> ( ) . boolean ( javax.lang.model.element.Modifier . javax.lang.model.element.Modifier ) && ( boolean ( javax.lang.model.element.VariableElement , java.lang.String ) || boolean ( javax.lang.model.element.TypeElement , java.lang.String ) || boolean ( javax.lang.model.element.TypeElement , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement , javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement , java.lang.String java.lang.String , javax.lang.model.element.ExecutableElement javax.lang.model.element.ExecutableElement , javax.lang.model.element.VariableElement javax.lang.model.element.VariableElement , javax.lang.model.type.TypeMirror javax.lang.model.type.TypeMirror ) { javax.lang.model.element.Element javax.lang.model.element.Element = this . javax.annotation.processing.ProcessingEnvironment . javax.lang.model.util.Types ( ) . javax.lang.model.element.Element ( javax.lang.model.type.TypeMirror ) ; boolean boolean = boolean ( javax.lang.model.element.Element , javax.lang.model.element.VariableElement , javax.lang.model.element.TypeElement ) ; javax.lang.model.element.AnnotationMirror javax.lang.model.element.AnnotationMirror = javax.lang.model.element.AnnotationMirror ( javax.lang.model.element.ExecutableElement , java.lang.String ( ) ) ; if ( javax.lang.model.element.Element != null && javax.lang.model.element.Element instanceof javax.lang.model.element.TypeElement && javax.lang.model.element.AnnotationMirror == null && boolean ) { java.lang.String java.lang.String = ConfigurationMetadata . nestedPrefix ( java.lang.String , java.lang.String ) ; this . org.springframework.boot.configurationprocessor.MetadataCollector . add ( ItemMetadata . newGroup ( java.lang.String , this . org.springframework.boot.configurationprocessor.TypeUtils . getQualifiedName ( javax.lang.model.element.Element ) , this . org.springframework.boot.configurationprocessor.TypeUtils . getQualifiedName ( javax.lang.model.element.TypeElement ) , ( javax.lang.model.element.ExecutableElement == null ? null : javax.lang.model.element.ExecutableElement . java.lang.String ( ) ) ) ) ; void ( java.lang.String , ( javax.lang.model.element.TypeElement ) javax.lang.model.element.Element , javax.lang.model.element.ExecutableElement ) ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( javax.lang.model.element.Element javax.lang.model.element.Element , javax.lang.model.element.VariableElement javax.lang.model.element.VariableElement , javax.lang.model.element.TypeElement javax.lang.model.element.TypeElement ) { if ( boolean ( javax.lang.model.element.VariableElement , java.lang.String ( ) ) ) { return true ; } return this . org.springframework.boot.configurationprocessor.TypeUtils . isEnclosedIn ( javax.lang.model.element.Element , javax.lang.model.element.TypeElement ) && javax.lang.model.element.Element . javax.lang.model.element.ElementKind ( ) != javax.lang.model.element.ElementKind . javax.lang.model.element.ElementKind ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( javax.lang.model.element.Element javax.lang.model.element.Element ) { if ( boolean ( javax.lang.model.element.Element ) ) { return true ; } if ( javax.lang.model.element.Element != null && ( javax.lang.model.element.Element instanceof javax.lang.model.element.VariableElement || javax.lang.model.element.Element instanceof javax.lang.model.element.ExecutableElement ) ) { return boolean ( javax.lang.model.element.Element . javax.lang.model.element.Element ( ) ) ; } return false ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( javax.lang.model.element.Element javax.lang.model.element.Element ) { return boolean ( javax.lang.model.element.Element , STRING ) || boolean ( javax.lang.model.element.Element , java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( javax.lang.model.element.Element javax.lang.model.element.Element , java.lang.String java.lang.String ) { return javax.lang.model.element.AnnotationMirror ( javax.lang.model.element.Element , java.lang.String ) != null ; }  <METHOD_END>
<METHOD_START> private javax.lang.model.element.AnnotationMirror javax.lang.model.element.AnnotationMirror ( javax.lang.model.element.Element javax.lang.model.element.Element , java.lang.String java.lang.String ) { if ( javax.lang.model.element.Element != null ) { for ( javax.lang.model.element.AnnotationMirror javax.lang.model.element.AnnotationMirror : javax.lang.model.element.Element . java.util.List<? extends javax.lang.model.element.AnnotationMirror> ( ) ) { if ( java.lang.String . boolean ( javax.lang.model.element.AnnotationMirror . javax.lang.model.type.DeclaredType ( ) . java.lang.String ( ) ) ) { return javax.lang.model.element.AnnotationMirror ; } } } return null ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( javax.lang.model.element.AnnotationMirror javax.lang.model.element.AnnotationMirror ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( javax.lang.model.element.AnnotationMirror ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; if ( java.lang.Object != null && ! STRING . boolean ( java.lang.Object ) ) { return ( java.lang.String ) java.lang.Object ; } java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; if ( java.lang.Object != null && ! STRING . boolean ( java.lang.Object ) ) { return ( java.lang.String ) java.lang.Object ; } return null ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( javax.lang.model.element.AnnotationMirror javax.lang.model.element.AnnotationMirror ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( ) ; for ( java.util.Map . java.util.Map.Entry<? extends javax.lang.model.element.ExecutableElement,? extends javax.lang.model.element.AnnotationValue> < ? extends javax.lang.model.element.ExecutableElement , ? extends javax.lang.model.element.AnnotationValue > java.util.Map.Entry<? extends javax.lang.model.element.ExecutableElement,? extends javax.lang.model.element.AnnotationValue> : javax.lang.model.element.AnnotationMirror . java.util.Map<? extends javax.lang.model.element.ExecutableElement,? extends javax.lang.model.element.AnnotationValue> ( ) . java.util.Set<java.util.Map.Entry<,>> ( ) ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.util.Map.Entry<,> . getKey ( ) . javax.lang.model.element.Name ( ) . java.lang.String ( ) , java.util.Map.Entry<,> . getValue ( ) . java.lang.Object ( ) ) ; } return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.configurationprocessor.ConfigurationMetadata org.springframework.boot.configurationprocessor.ConfigurationMetadata ( ) java.lang.Exception { ConfigurationMetadata org.springframework.boot.configurationprocessor.ConfigurationMetadata = this . org.springframework.boot.configurationprocessor.MetadataCollector . getMetadata ( ) ; org.springframework.boot.configurationprocessor.ConfigurationMetadata = org.springframework.boot.configurationprocessor.ConfigurationMetadata ( org.springframework.boot.configurationprocessor.ConfigurationMetadata ) ; if ( ! org.springframework.boot.configurationprocessor.ConfigurationMetadata . getItems ( ) . isEmpty ( ) ) { this . org.springframework.boot.configurationprocessor.MetadataStore . writeMetadata ( org.springframework.boot.configurationprocessor.ConfigurationMetadata ) ; return org.springframework.boot.configurationprocessor.ConfigurationMetadata ; } return null ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.configurationprocessor.ConfigurationMetadata org.springframework.boot.configurationprocessor.ConfigurationMetadata ( ConfigurationMetadata org.springframework.boot.configurationprocessor.ConfigurationMetadata ) { try { ConfigurationMetadata org.springframework.boot.configurationprocessor.ConfigurationMetadata = new ConfigurationMetadata ( org.springframework.boot.configurationprocessor.ConfigurationMetadata ) ; org.springframework.boot.configurationprocessor.ConfigurationMetadata . merge ( this . org.springframework.boot.configurationprocessor.MetadataStore . readAdditionalMetadata ( ) ) ; return org.springframework.boot.configurationprocessor.ConfigurationMetadata ; } catch ( java.io.FileNotFoundException java.io.FileNotFoundException ) { } catch ( InvalidConfigurationMetadataException org.springframework.boot.configurationprocessor.InvalidConfigurationMetadataException ) { void ( org.springframework.boot.configurationprocessor.InvalidConfigurationMetadataException . getKind ( ) , org.springframework.boot.configurationprocessor.InvalidConfigurationMetadataException . getMessage ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { void ( STRING ) ; void ( java.lang.String ( java.lang.Exception ) ) ; } return org.springframework.boot.configurationprocessor.ConfigurationMetadata ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.Exception java.lang.Exception ) { java.io.StringWriter java.io.StringWriter = new java.io.StringWriter ( ) ; java.lang.Exception . void ( new java.io.PrintWriter ( java.io.StringWriter , true ) ) ; return java.io.StringWriter . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { void ( javax.tools.Diagnostic.Kind . javax.tools.Diagnostic.Kind , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private void void ( javax.tools.Diagnostic.Kind javax.tools.Diagnostic.Kind , java.lang.String java.lang.String ) { this . javax.annotation.processing.ProcessingEnvironment . javax.annotation.processing.Messager ( ) . void ( javax.tools.Diagnostic.Kind , java.lang.String ) ; }  <METHOD_END>
