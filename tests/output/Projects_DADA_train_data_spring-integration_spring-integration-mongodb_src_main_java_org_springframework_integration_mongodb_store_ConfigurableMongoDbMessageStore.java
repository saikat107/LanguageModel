<METHOD_START> public void ( MongoTemplate org.springframework.integration.mongodb.store.MongoTemplate ) { this( org.springframework.integration.mongodb.store.MongoTemplate , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( MongoTemplate org.springframework.integration.mongodb.store.MongoTemplate , java.lang.String java.lang.String ) { super( org.springframework.integration.mongodb.store.MongoTemplate , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( MongoDbFactory org.springframework.integration.mongodb.store.MongoDbFactory ) { this( org.springframework.integration.mongodb.store.MongoDbFactory , null , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( MongoDbFactory org.springframework.integration.mongodb.store.MongoDbFactory , MappingMongoConverter org.springframework.integration.mongodb.store.MappingMongoConverter ) { this( org.springframework.integration.mongodb.store.MongoDbFactory , org.springframework.integration.mongodb.store.MappingMongoConverter , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( MongoDbFactory org.springframework.integration.mongodb.store.MongoDbFactory , java.lang.String java.lang.String ) { this( org.springframework.integration.mongodb.store.MongoDbFactory , null , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( MongoDbFactory org.springframework.integration.mongodb.store.MongoDbFactory , MappingMongoConverter org.springframework.integration.mongodb.store.MappingMongoConverter , java.lang.String java.lang.String ) { super( org.springframework.integration.mongodb.store.MongoDbFactory , org.springframework.integration.mongodb.store.MappingMongoConverter , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void void ( java.util.Collection<org.springframework.integration.mongodb.store.MessageGroupCallback> < MessageGroupCallback > java.util.Collection<org.springframework.integration.mongodb.store.MessageGroupCallback> ) { for ( MessageGroupCallback org.springframework.integration.mongodb.store.MessageGroupCallback : java.util.Collection<org.springframework.integration.mongodb.store.MessageGroupCallback> ) { void ( org.springframework.integration.mongodb.store.MessageGroupCallback ) ; } }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > org.springframework.integration.mongodb.store.Message<T> < T > org.springframework.integration.mongodb.store.Message<T> ( Message < T > org.springframework.integration.mongodb.store.Message<T> ) { Assert . notNull ( org.springframework.integration.mongodb.store.Message<T> , STRING ) ; this . addMessageDocument ( new MessageDocument ( org.springframework.integration.mongodb.store.Message<T> ) ) ; return org.springframework.integration.mongodb.store.Message<T> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.mongodb.store.Message<?> < ? > org.springframework.integration.mongodb.store.Message<?> ( java.util.UUID java.util.UUID ) { Assert . notNull ( java.util.UUID , STRING ) ; Query org.springframework.integration.mongodb.store.Query = Query . query ( Criteria . where ( MessageDocumentFields . MESSAGE_ID ) . is ( java.util.UUID ) ) ; MessageDocument org.springframework.integration.mongodb.store.MessageDocument = this . mongoTemplate . findAndRemove ( org.springframework.integration.mongodb.store.Query , MessageDocument .class , this . collectionName ) ; return ( org.springframework.integration.mongodb.store.MessageDocument != null ) ? org.springframework.integration.mongodb.store.MessageDocument . getMessage ( ) : null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { Query org.springframework.integration.mongodb.store.Query = Query . query ( Criteria . where ( MessageDocumentFields . MESSAGE_ID ) . exists ( true ) . and ( MessageDocumentFields . GROUP_ID ) . exists ( false ) ) ; return this . mongoTemplate . getCollection ( this . collectionName ) . count ( org.springframework.integration.mongodb.store.Query . getQueryObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.mongodb.store.MessageGroup org.springframework.integration.mongodb.store.MessageGroup ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; Query org.springframework.integration.mongodb.store.Query = org.springframework.integration.mongodb.store.Query ( java.lang.Object ) ; MessageDocument org.springframework.integration.mongodb.store.MessageDocument = this . mongoTemplate . findOne ( org.springframework.integration.mongodb.store.Query , MessageDocument .class , this . collectionName ) ; if ( org.springframework.integration.mongodb.store.MessageDocument != null ) { long long = org.springframework.integration.mongodb.store.MessageDocument . getGroupCreatedTime ( ) ; long long = org.springframework.integration.mongodb.store.MessageDocument . getLastModifiedTime ( ) ; boolean boolean = org.springframework.integration.mongodb.store.MessageDocument . isComplete ( ) ; int int = org.springframework.integration.mongodb.store.MessageDocument . getLastReleasedSequence ( ) ; MessageGroup org.springframework.integration.mongodb.store.MessageGroup = getMessageGroupFactory ( ) . create ( this , java.lang.Object , long , boolean ) ; org.springframework.integration.mongodb.store.MessageGroup . setLastModified ( long ) ; org.springframework.integration.mongodb.store.MessageGroup . setLastReleasedMessageSequenceNumber ( int ) ; return org.springframework.integration.mongodb.store.MessageGroup ; } else { return new SimpleMessageGroup ( java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.mongodb.store.MessageGroup org.springframework.integration.mongodb.store.MessageGroup ( java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.mongodb.store.Message<?> ) { void ( java.lang.Object , org.springframework.integration.mongodb.store.Message<> ) ; return org.springframework.integration.mongodb.store.MessageGroup ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , org.springframework.integration.mongodb.store.Message<?> < ? > ... org.springframework.integration.mongodb.store.Message<?>[] ) { Assert . notNull ( java.lang.Object , STRING ) ; Assert . notNull ( org.springframework.integration.mongodb.store.Message<?>[] , STRING ) ; Query org.springframework.integration.mongodb.store.Query = org.springframework.integration.mongodb.store.Query ( java.lang.Object ) ; MessageDocument org.springframework.integration.mongodb.store.MessageDocument = this . mongoTemplate . findOne ( org.springframework.integration.mongodb.store.Query , MessageDocument .class , this . collectionName ) ; long long = java.lang.System . long ( ) ; int int = NUMBER ; boolean boolean = false ; if ( org.springframework.integration.mongodb.store.MessageDocument != null ) { long = org.springframework.integration.mongodb.store.MessageDocument . getGroupCreatedTime ( ) ; int = org.springframework.integration.mongodb.store.MessageDocument . getLastReleasedSequence ( ) ; boolean = org.springframework.integration.mongodb.store.MessageDocument . isComplete ( ) ; } for ( Message < ? > org.springframework.integration.mongodb.store.Message<?> : org.springframework.integration.mongodb.store.Message<?>[] ) { MessageDocument org.springframework.integration.mongodb.store.MessageDocument = new MessageDocument ( org.springframework.integration.mongodb.store.Message<> ) ; org.springframework.integration.mongodb.store.MessageDocument . setGroupId ( java.lang.Object ) ; org.springframework.integration.mongodb.store.MessageDocument . setComplete ( boolean ) ; org.springframework.integration.mongodb.store.MessageDocument . setLastReleasedSequence ( int ) ; org.springframework.integration.mongodb.store.MessageDocument . setGroupCreatedTime ( long ) ; org.springframework.integration.mongodb.store.MessageDocument . setLastModifiedTime ( org.springframework.integration.mongodb.store.MessageDocument == null ? long : java.lang.System . long ( ) ) ; org.springframework.integration.mongodb.store.MessageDocument . setSequence ( getNextId ( ) ) ; addMessageDocument ( org.springframework.integration.mongodb.store.MessageDocument ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.util.Collection<org.springframework.integration.mongodb.store.Message<?>> < Message < ? > > java.util.Collection<org.springframework.integration.mongodb.store.Message<?>> ) { Assert . notNull ( java.lang.Object , STRING ) ; Assert . notNull ( java.util.Collection<org.springframework.integration.mongodb.store.Message<?>> , STRING ) ; java.util.Collection<java.util.UUID> < java.util.UUID > java.util.Collection<java.util.UUID> = new java.util.ArrayList<java.util.UUID> < java.util.UUID > ( ) ; for ( Message < ? > org.springframework.integration.mongodb.store.Message<?> : java.util.Collection<org.springframework.integration.mongodb.store.Message<?>> ) { java.util.Collection<java.util.UUID> . boolean ( org.springframework.integration.mongodb.store.Message<> . getHeaders ( ) . getId ( ) ) ; if ( java.util.Collection<java.util.UUID> . int ( ) >= getRemoveBatchSize ( ) ) { void ( java.lang.Object , java.util.Collection<java.util.UUID> ) ; java.util.Collection<java.util.UUID> . void ( ) ; } } if ( java.util.Collection<java.util.UUID> . int ( ) > NUMBER ) { void ( java.lang.Object , java.util.Collection<java.util.UUID> ) ; } void ( java.lang.Object , org.springframework.integration.mongodb.store.Update ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object , java.util.Collection<java.util.UUID> < java.util.UUID > java.util.Collection<java.util.UUID> ) { Query org.springframework.integration.mongodb.store.Query = groupIdQuery ( java.lang.Object ) . addCriteria ( Criteria . where ( MessageDocumentFields . MESSAGE_ID ) . in ( java.util.Collection<java.util.UUID> . java.lang.Object[] ( ) ) ) ; this . mongoTemplate . remove ( org.springframework.integration.mongodb.store.Query , this . collectionName ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , org.springframework.integration.mongodb.store.Message<?> < ? > ... org.springframework.integration.mongodb.store.Message<?>[] ) { void ( java.lang.Object , java.util.Arrays . java.util.List ( org.springframework.integration.mongodb.store.Message<?>[] ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.mongodb.store.Message<?> < ? > org.springframework.integration.mongodb.store.Message<?> ( final java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; Sort org.springframework.integration.mongodb.store.Sort = Sort . by ( MessageDocumentFields . LAST_MODIFIED_TIME , MessageDocumentFields . SEQUENCE ) ; Query org.springframework.integration.mongodb.store.Query = groupIdQuery ( java.lang.Object ) . with ( org.springframework.integration.mongodb.store.Sort ) ; MessageDocument org.springframework.integration.mongodb.store.MessageDocument = mongoTemplate . findAndRemove ( org.springframework.integration.mongodb.store.Query , MessageDocument .class , collectionName ) ; Message < ? > org.springframework.integration.mongodb.store.Message<?> = null ; if ( org.springframework.integration.mongodb.store.MessageDocument != null ) { org.springframework.integration.mongodb.store.Message<?> = org.springframework.integration.mongodb.store.MessageDocument . getMessage ( ) ; void ( java.lang.Object , org.springframework.integration.mongodb.store.Update ( ) ) ; } return org.springframework.integration.mongodb.store.Message<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , int int ) { this . void ( java.lang.Object , org.springframework.integration.mongodb.store.Update ( ) . set ( MessageDocumentFields . LAST_RELEASED_SEQUENCE , int ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { this . void ( java.lang.Object , org.springframework.integration.mongodb.store.Update ( ) . set ( MessageDocumentFields . COMPLETE , true ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<org.springframework.integration.mongodb.store.MessageGroup> < MessageGroup > java.util.Iterator<org.springframework.integration.mongodb.store.MessageGroup> ( ) { java.util.List<org.springframework.integration.mongodb.store.MessageGroup> < MessageGroup > java.util.List<org.springframework.integration.mongodb.store.MessageGroup> = new java.util.ArrayList<org.springframework.integration.mongodb.store.MessageGroup> < MessageGroup > ( ) ; Query org.springframework.integration.mongodb.store.Query = Query . query ( Criteria . where ( MessageDocumentFields . GROUP_ID ) . exists ( true ) ) ; java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> = mongoTemplate . getCollection ( collectionName ) . distinct ( MessageDocumentFields . GROUP_ID , org.springframework.integration.mongodb.store.Query . getQueryObject ( ) , java.lang.String .class ) ; for ( java.lang.Object java.lang.Object : java.lang.Iterable<java.lang.String> ) { java.util.List<org.springframework.integration.mongodb.store.MessageGroup> . add ( org.springframework.integration.mongodb.store.MessageGroup ( java.lang.Object ) ) ; } return java.util.List<org.springframework.integration.mongodb.store.MessageGroup> . iterator ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MessageGroupCallback org.springframework.integration.mongodb.store.MessageGroupCallback ) { this . java.util.Collection<org.springframework.integration.mongodb.store.MessageGroupCallback> . add ( org.springframework.integration.mongodb.store.MessageGroupCallback ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedOperation public int int ( long long ) { int int = NUMBER ; long long = java.lang.System . long ( ) - long ; for ( MessageGroup org.springframework.integration.mongodb.store.MessageGroup : this ) { long long = org.springframework.integration.mongodb.store.MessageGroup . getTimestamp ( ) ; if ( this . boolean ( ) && org.springframework.integration.mongodb.store.MessageGroup . getLastModified ( ) > NUMBER ) { long = org.springframework.integration.mongodb.store.MessageGroup . getLastModified ( ) ; } if ( long <= long ) { int ++ ; void ( org.springframework.integration.mongodb.store.MessageGroup ) ; } } return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedAttribute public int int ( ) { Query org.springframework.integration.mongodb.store.Query = Query . query ( Criteria . where ( MessageDocumentFields . MESSAGE_ID ) . exists ( true ) . and ( MessageDocumentFields . GROUP_ID ) . exists ( true ) ) ; long long = this . mongoTemplate . count ( org.springframework.integration.mongodb.store.Query , this . collectionName ) ; Assert . isTrue ( long <= java.lang.Integer . int , STRING ) ; return ( int ) long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedAttribute public int int ( ) { Query org.springframework.integration.mongodb.store.Query = Query . query ( Criteria . where ( MessageDocumentFields . GROUP_ID ) . exists ( true ) ) ; return this . mongoTemplate . getCollection ( this . collectionName ) . distinct ( MessageDocumentFields . GROUP_ID , org.springframework.integration.mongodb.store.Query . getQueryObject ( ) , java.lang.Object .class ) . into ( new java.util.ArrayList <> ( ) ) . size ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.mongodb.store.MessageGroupMetadata org.springframework.integration.mongodb.store.MessageGroupMetadata ( java.lang.Object java.lang.Object ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.mongodb.store.Message<?> < ? > org.springframework.integration.mongodb.store.Message<?> ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; Query org.springframework.integration.mongodb.store.Query = org.springframework.integration.mongodb.store.Query ( java.lang.Object ) ; MessageDocument org.springframework.integration.mongodb.store.MessageDocument = this . mongoTemplate . findOne ( org.springframework.integration.mongodb.store.Query , MessageDocument .class , this . collectionName ) ; if ( org.springframework.integration.mongodb.store.MessageDocument != null ) { return org.springframework.integration.mongodb.store.MessageDocument . getMessage ( ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.integration.mongodb.store.Message<?>> < Message < ? > > java.util.Collection<org.springframework.integration.mongodb.store.Message<?>> ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; Query org.springframework.integration.mongodb.store.Query = org.springframework.integration.mongodb.store.Query ( java.lang.Object ) ; java.util.List<org.springframework.integration.mongodb.store.MessageDocument> < MessageDocument > java.util.List<org.springframework.integration.mongodb.store.MessageDocument> = this . mongoTemplate . find ( org.springframework.integration.mongodb.store.Query , MessageDocument .class , this . collectionName ) ; java.util.List<org.springframework.integration.mongodb.store.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.mongodb.store.Message<?>> = new java.util.ArrayList<org.springframework.integration.mongodb.store.Message<?>> < Message < ? > > ( ) ; for ( MessageDocument org.springframework.integration.mongodb.store.MessageDocument : java.util.List<org.springframework.integration.mongodb.store.MessageDocument> ) { java.util.List<org.springframework.integration.mongodb.store.Message<?>> . add ( org.springframework.integration.mongodb.store.MessageDocument . getMessage ( ) ) ; } return java.util.List<org.springframework.integration.mongodb.store.Message<?>> ; }  <METHOD_END>
<METHOD_START> private void void ( MessageGroup org.springframework.integration.mongodb.store.MessageGroup ) { java.lang.RuntimeException java.lang.RuntimeException = null ; for ( MessageGroupCallback org.springframework.integration.mongodb.store.MessageGroupCallback : this . java.util.Collection<org.springframework.integration.mongodb.store.MessageGroupCallback> ) { try { org.springframework.integration.mongodb.store.MessageGroupCallback . execute ( this , org.springframework.integration.mongodb.store.MessageGroup ) ; } catch ( java.lang.RuntimeException java.lang.RuntimeException ) { if ( java.lang.RuntimeException == null ) { java.lang.RuntimeException = java.lang.RuntimeException ; } logger . error ( STRING , java.lang.RuntimeException ) ; } } if ( java.lang.RuntimeException != null ) { throw java.lang.RuntimeException ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object , Update org.springframework.integration.mongodb.store.Update ) { this . mongoTemplate . updateFirst ( org.springframework.integration.mongodb.store.Query ( java.lang.Object ) , org.springframework.integration.mongodb.store.Update , this . collectionName ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.integration.mongodb.store.Update org.springframework.integration.mongodb.store.Update ( ) { return Update . update ( MessageDocumentFields . LAST_MODIFIED_TIME , java.lang.System . long ( ) ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.integration.mongodb.store.Query org.springframework.integration.mongodb.store.Query ( java.lang.Object java.lang.Object ) { Sort org.springframework.integration.mongodb.store.Sort = Sort . by ( Sort . Direction . DESC , MessageDocumentFields . LAST_MODIFIED_TIME , MessageDocumentFields . SEQUENCE ) ; return groupIdQuery ( java.lang.Object ) . with ( org.springframework.integration.mongodb.store.Sort ) ; }  <METHOD_END>
