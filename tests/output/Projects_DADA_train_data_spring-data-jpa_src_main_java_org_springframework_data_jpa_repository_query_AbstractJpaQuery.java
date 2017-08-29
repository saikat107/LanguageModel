<METHOD_START> public void ( JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod , EntityManager org.springframework.data.jpa.repository.query.EntityManager ) { Assert . notNull ( org.springframework.data.jpa.repository.query.JpaQueryMethod , STRING ) ; Assert . notNull ( org.springframework.data.jpa.repository.query.EntityManager , STRING ) ; this . org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ; this . org.springframework.data.jpa.repository.query.EntityManager = org.springframework.data.jpa.repository.query.EntityManager ; this . org.springframework.data.jpa.repository.query.JpaMetamodel = new JpaMetamodel ( org.springframework.data.jpa.repository.query.EntityManager . getMetamodel ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.jpa.repository.query.JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod ( ) { return org.springframework.data.jpa.repository.query.JpaQueryMethod ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.jpa.repository.query.EntityManager org.springframework.data.jpa.repository.query.EntityManager ( ) { return org.springframework.data.jpa.repository.query.EntityManager ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.jpa.repository.query.JpaMetamodel org.springframework.data.jpa.repository.query.JpaMetamodel ( ) { return org.springframework.data.jpa.repository.query.JpaMetamodel ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object [] java.lang.Object[] ) { return java.lang.Object ( org.springframework.data.jpa.repository.query.JpaQueryExecution ( ) , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( JpaQueryExecution org.springframework.data.jpa.repository.query.JpaQueryExecution , java.lang.Object [] java.lang.Object[] ) { java.lang.Object java.lang.Object = org.springframework.data.jpa.repository.query.JpaQueryExecution . execute ( this , java.lang.Object[] ) ; ParametersParameterAccessor org.springframework.data.jpa.repository.query.ParametersParameterAccessor = new ParametersParameterAccessor ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getParameters ( ) , java.lang.Object[] ) ; ResultProcessor org.springframework.data.jpa.repository.query.ResultProcessor = org.springframework.data.jpa.repository.query.JpaQueryMethod . getResultProcessor ( ) . withDynamicProjection ( org.springframework.data.jpa.repository.query.ParametersParameterAccessor ) ; return org.springframework.data.jpa.repository.query.ResultProcessor . processResult ( java.lang.Object , new org.springframework.data.jpa.repository.query.AbstractJpaQuery.TupleConverter ( org.springframework.data.jpa.repository.query.ResultProcessor . getReturnedType ( ) ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.jpa.repository.query.JpaQueryExecution org.springframework.data.jpa.repository.query.JpaQueryExecution ( ) { if ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isStreamQuery ( ) ) { return new StreamExecution ( ) ; } else if ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isProcedureQuery ( ) ) { return new ProcedureExecution ( ) ; } else if ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isCollectionQuery ( ) ) { return new CollectionExecution ( ) ; } else if ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isSliceQuery ( ) ) { return new SlicedExecution ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getParameters ( ) ) ; } else if ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isPageQuery ( ) ) { return new PagedExecution ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getParameters ( ) ) ; } else if ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isModifyingQuery ( ) ) { return org.springframework.data.jpa.repository.query.JpaQueryMethod . getClearAutomatically ( ) ? new ModifyingExecution ( org.springframework.data.jpa.repository.query.JpaQueryMethod , org.springframework.data.jpa.repository.query.EntityManager ) : new ModifyingExecution ( org.springframework.data.jpa.repository.query.JpaQueryMethod , null ) ; } else { return new SingleEntityExecution ( ) ; } }  <METHOD_END>
<METHOD_START> protected < T extends org.springframework.data.jpa.repository.query.Query > T T ( T T , JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod ) { for ( QueryHint org.springframework.data.jpa.repository.query.QueryHint : org.springframework.data.jpa.repository.query.JpaQueryMethod . getHints ( ) ) { void ( T , org.springframework.data.jpa.repository.query.QueryHint ) ; } return T ; }  <METHOD_END>
<METHOD_START> protected < T extends org.springframework.data.jpa.repository.query.Query > void void ( T T , QueryHint org.springframework.data.jpa.repository.query.QueryHint ) { Assert . notNull ( T , STRING ) ; Assert . notNull ( org.springframework.data.jpa.repository.query.QueryHint , STRING ) ; T . setHint ( org.springframework.data.jpa.repository.query.QueryHint . name ( ) , org.springframework.data.jpa.repository.query.QueryHint . value ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.jpa.repository.query.Query org.springframework.data.jpa.repository.query.Query ( Query org.springframework.data.jpa.repository.query.Query , JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod ) { LockModeType org.springframework.data.jpa.repository.query.LockModeType = org.springframework.data.jpa.repository.query.JpaQueryMethod . getLockModeType ( ) ; return org.springframework.data.jpa.repository.query.LockModeType == null ? org.springframework.data.jpa.repository.query.Query : org.springframework.data.jpa.repository.query.Query . setLockMode ( org.springframework.data.jpa.repository.query.LockModeType ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.jpa.repository.query.ParameterBinder org.springframework.data.jpa.repository.query.ParameterBinder ( java.lang.Object [] java.lang.Object[] ) { return new ParameterBinder ( org.springframework.data.jpa.repository.query.JpaQueryMethod ( ) . getParameters ( ) , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.jpa.repository.query.Query org.springframework.data.jpa.repository.query.Query ( java.lang.Object [] java.lang.Object[] ) { return org.springframework.data.jpa.repository.query.Query ( org.springframework.data.jpa.repository.query.Query ( org.springframework.data.jpa.repository.query.Query ( org.springframework.data.jpa.repository.query.Query ( java.lang.Object[] ) , org.springframework.data.jpa.repository.query.JpaQueryMethod ) , org.springframework.data.jpa.repository.query.JpaQueryMethod ) , org.springframework.data.jpa.repository.query.JpaQueryMethod ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.jpa.repository.query.Query org.springframework.data.jpa.repository.query.Query ( Query org.springframework.data.jpa.repository.query.Query , JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod ) { Assert . notNull ( org.springframework.data.jpa.repository.query.Query , STRING ) ; Assert . notNull ( org.springframework.data.jpa.repository.query.JpaQueryMethod , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = Jpa21Utils . tryGetFetchGraphHints ( org.springframework.data.jpa.repository.query.EntityManager , org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) , org.springframework.data.jpa.repository.query.JpaQueryMethod ( ) . getEntityInformation ( ) . getJavaType ( ) ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map.Entry<java.lang.String,java.lang.Object> : java.util.Map<java.lang.String,java.lang.Object> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.Object>> ( ) ) { org.springframework.data.jpa.repository.query.Query . setHint ( java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.String ( ) , java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.Object ( ) ) ; } return org.springframework.data.jpa.repository.query.Query ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.jpa.repository.query.Query org.springframework.data.jpa.repository.query.Query ( java.lang.Object [] java.lang.Object[] ) { Query org.springframework.data.jpa.repository.query.Query = org.springframework.data.jpa.repository.query.Query ( java.lang.Object[] ) ; return org.springframework.data.jpa.repository.query.JpaQueryMethod . applyHintsToCountQuery ( ) ? org.springframework.data.jpa.repository.query.Query ( org.springframework.data.jpa.repository.query.Query , org.springframework.data.jpa.repository.query.JpaQueryMethod ) : org.springframework.data.jpa.repository.query.Query ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.data.jpa.repository.query.Query org.springframework.data.jpa.repository.query.Query ( java.lang.Object [] java.lang.Object[] );  <METHOD_END>
<METHOD_START> protected abstract org.springframework.data.jpa.repository.query.Query org.springframework.data.jpa.repository.query.Query ( java.lang.Object [] java.lang.Object[] );  <METHOD_END>
<METHOD_START> public void ( ReturnedType org.springframework.data.jpa.repository.query.ReturnedType ) { Assert . notNull ( org.springframework.data.jpa.repository.query.ReturnedType , STRING ) ; this . org.springframework.data.jpa.repository.query.ReturnedType = org.springframework.data.jpa.repository.query.ReturnedType ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { if ( ! ( java.lang.Object instanceof Tuple ) ) { return java.lang.Object ; } Tuple org.springframework.data.jpa.repository.query.Tuple = ( Tuple ) java.lang.Object ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.List<org.springframework.data.jpa.repository.query.TupleElement<?>> < TupleElement < ? > > java.util.List<org.springframework.data.jpa.repository.query.TupleElement<?>> = org.springframework.data.jpa.repository.query.Tuple . getElements ( ) ; if ( java.util.List<org.springframework.data.jpa.repository.query.TupleElement<?>> . size ( ) == NUMBER ) { java.lang.Object java.lang.Object = org.springframework.data.jpa.repository.query.Tuple . get ( java.util.List<org.springframework.data.jpa.repository.query.TupleElement<?>> . get ( NUMBER ) ) ; if ( org.springframework.data.jpa.repository.query.ReturnedType . isInstance ( java.lang.Object ) || java.lang.Object == null ) { return java.lang.Object ; } } for ( TupleElement < ? > org.springframework.data.jpa.repository.query.TupleElement<?> : java.util.List<org.springframework.data.jpa.repository.query.TupleElement<?>> ) { java.lang.String java.lang.String = org.springframework.data.jpa.repository.query.TupleElement<> . getAlias ( ) ; if ( java.lang.String == null || boolean ( java.lang.String ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( org.springframework.data.jpa.repository.query.TupleElement<> . getAlias ( ) , org.springframework.data.jpa.repository.query.Tuple . get ( org.springframework.data.jpa.repository.query.TupleElement<> ) ) ; } return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( java.lang.String java.lang.String ) { try { java.lang.Integer . int ( java.lang.String ) ; return true ; } catch ( java.lang.NumberFormatException java.lang.NumberFormatException ) { return false ; } }  <METHOD_END>