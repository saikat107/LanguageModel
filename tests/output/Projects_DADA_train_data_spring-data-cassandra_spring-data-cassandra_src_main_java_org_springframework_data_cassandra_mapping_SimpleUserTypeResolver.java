<METHOD_START> public void ( Cluster org.springframework.data.cassandra.mapping.Cluster , java.lang.String java.lang.String ) { Assert . notNull ( org.springframework.data.cassandra.mapping.Cluster , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; this . org.springframework.data.cassandra.mapping.Cluster = org.springframework.data.cassandra.mapping.Cluster ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.mapping.UserType org.springframework.data.cassandra.mapping.UserType ( CqlIdentifier org.springframework.data.cassandra.mapping.CqlIdentifier ) { KeyspaceMetadata org.springframework.data.cassandra.mapping.KeyspaceMetadata = org.springframework.data.cassandra.mapping.Cluster . getMetadata ( ) . getKeyspace ( java.lang.String ) ; return org.springframework.data.cassandra.mapping.KeyspaceMetadata . getUserType ( org.springframework.data.cassandra.mapping.CqlIdentifier . toCql ( ) ) ; }  <METHOD_END>