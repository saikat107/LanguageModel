<METHOD_START> public org.springframework.data.repository.util.WrapperType org.springframework.data.repository.util.WrapperType ( ) { return WrapperType . multiValue ( javaslang . javaslang . javaslang .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof javaslang . javaslang . javaslang ) { return ( ( javaslang . javaslang . javaslang < ? > ) java.lang.Object ) . toJavaList ( ) ; } if ( java.lang.Object instanceof javaslang . javaslang . javaslang ) { return ( ( javaslang . javaslang . javaslang < ? , ? > ) java.lang.Object ) . toJavaMap ( ) ; } if ( java.lang.Object instanceof javaslang . javaslang . javaslang ) { return ( ( javaslang . javaslang . javaslang < ? > ) java.lang.Object ) . toJavaSet ( ) ; } throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java . util . java.util.Set<org.springframework.data.repository.util.ConvertiblePair> < ConvertiblePair > java.util.Set<org.springframework.data.repository.util.ConvertiblePair> ( ) { return java.util.Set<org.springframework.data.repository.util.ConvertiblePair> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( TypeDescriptor org.springframework.data.repository.util.TypeDescriptor , TypeDescriptor org.springframework.data.repository.util.TypeDescriptor ) { if ( org.springframework.data.repository.util.TypeDescriptor . isCollection ( ) && javaslang . javaslang . javaslang .class . boolean ( org.springframework.data.repository.util.TypeDescriptor . getType ( ) ) ) { return false ; } if ( org.springframework.data.repository.util.TypeDescriptor . isMap ( ) && ! ( javaslang . javaslang . javaslang .class . boolean ( org.springframework.data.repository.util.TypeDescriptor . getType ( ) ) || org.springframework.data.repository.util.TypeDescriptor . getType ( ) . equals ( Traversable .class ) ) ) { return false ; } return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeDescriptor org.springframework.data.repository.util.TypeDescriptor , TypeDescriptor org.springframework.data.repository.util.TypeDescriptor ) { if ( java.lang.Object instanceof java.util.List ) { return javaslang . collection . List . ofAll ( ( java.lang.Iterable<?> < ? > ) java.lang.Object ) ; } if ( java.lang.Object instanceof java . util . java.util.Set ) { return LinkedHashSet . ofAll ( ( java.lang.Iterable<?> < ? > ) java.lang.Object ) ; } if ( java.lang.Object instanceof java . util . java.util.Map ) { return LinkedHashMap . ofAll ( ( java . util . java.util.Map<?,?> < ? , ? > ) java.lang.Object ) ; } return java.lang.Object ; }  <METHOD_END>
