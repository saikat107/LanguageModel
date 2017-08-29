<METHOD_START> public void ( TypeInformation < T > org.springframework.data.cassandra.mapping.TypeInformation<T> , CassandraMappingContext org.springframework.data.cassandra.mapping.CassandraMappingContext , CassandraPersistentEntityMetadataVerifier org.springframework.data.cassandra.mapping.CassandraPersistentEntityMetadataVerifier , UserTypeResolver org.springframework.data.cassandra.mapping.UserTypeResolver ) { super( org.springframework.data.cassandra.mapping.TypeInformation<T> , org.springframework.data.cassandra.mapping.CassandraMappingContext , org.springframework.data.cassandra.mapping.CassandraPersistentEntityMetadataVerifier ); Assert . notNull ( org.springframework.data.cassandra.mapping.UserTypeResolver , STRING ) ; this . org.springframework.data.cassandra.mapping.UserTypeResolver = org.springframework.data.cassandra.mapping.UserTypeResolver ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.cassandra.mapping.CqlIdentifier org.springframework.data.cassandra.mapping.CqlIdentifier ( ) { java.util.Optional<org.springframework.data.cassandra.mapping.UserDefinedType> < UserDefinedType > java.util.Optional<org.springframework.data.cassandra.mapping.UserDefinedType> = findAnnotation ( UserDefinedType .class ) ; return java.util.Optional<org.springframework.data.cassandra.mapping.UserDefinedType> . map ( userDefinedType -> determineName ( userDefinedType . value ( ) , userDefinedType . forceQuote ( ) ) ) . orElseGet ( super:: determineDefaultName ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.mapping.UserType org.springframework.data.cassandra.mapping.UserType ( ) { if ( org.springframework.data.cassandra.mapping.UserType == null ) { synchronized ( java.lang.Object ) { if ( org.springframework.data.cassandra.mapping.UserType == null ) { CqlIdentifier org.springframework.data.cassandra.mapping.CqlIdentifier = org.springframework.data.cassandra.mapping.CqlIdentifier ( ) ; UserType org.springframework.data.cassandra.mapping.UserType = org.springframework.data.cassandra.mapping.UserTypeResolver . resolveType ( org.springframework.data.cassandra.mapping.CqlIdentifier ) ; if ( org.springframework.data.cassandra.mapping.UserType == null ) { throw new MappingException ( java.lang.String . java.lang.String ( STRING , org.springframework.data.cassandra.mapping.CqlIdentifier ) ) ; } this . org.springframework.data.cassandra.mapping.UserType = org.springframework.data.cassandra.mapping.UserType ; } } } return org.springframework.data.cassandra.mapping.UserType ; }  <METHOD_END>
