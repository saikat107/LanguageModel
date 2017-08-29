<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; entityManager . remove ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Iterable<?> < ? > java.lang.Iterable<?> ) { Assert . notNull ( java.lang.Iterable<> , STRING ) ; java.util.Iterator<?> < ? > java.util.Iterator<?> = java.lang.Iterable<> . java.util.Iterator<> ( ) ; if ( ! java.util.Iterator<> . boolean ( ) ) { return; } java.lang.Class<?> < ? > java.lang.Class<?> = null ; for ( java.lang.Object java.lang.Object : java.lang.Iterable<> ) { if ( java.lang.Class<> == null ) { java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; } else { if ( java.lang.Class<> != java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } } } final java.lang.String java.lang.String = JpaUtils . getEntityName ( entityManager , java.lang.Class<> ) ; final java.lang.String java.lang.String = JpaUtils . getQueryString ( JpaUtils . DELETE_ALL_QUERY_STRING , java.lang.String ) ; JpaUtils . applyAndBind ( java.lang.String , java.lang.Iterable<> , entityManager ) . executeUpdate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.lang.String java.lang.String , ParameterSource org.springframework.integration.jpa.core.ParameterSource ) { Query org.springframework.integration.jpa.core.Query = entityManager . createQuery ( java.lang.String ) ; void ( java.lang.String , org.springframework.integration.jpa.core.ParameterSource , org.springframework.integration.jpa.core.Query ) ; return org.springframework.integration.jpa.core.Query . executeUpdate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.lang.String java.lang.String , ParameterSource org.springframework.integration.jpa.core.ParameterSource ) { Query org.springframework.integration.jpa.core.Query = entityManager . createNamedQuery ( java.lang.String ) ; void ( java.lang.String , org.springframework.integration.jpa.core.ParameterSource , org.springframework.integration.jpa.core.Query ) ; return org.springframework.integration.jpa.core.Query . executeUpdate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.lang.String java.lang.String , ParameterSource org.springframework.integration.jpa.core.ParameterSource ) { Query org.springframework.integration.jpa.core.Query = entityManager . createNativeQuery ( java.lang.String ) ; void ( java.lang.String , org.springframework.integration.jpa.core.ParameterSource , org.springframework.integration.jpa.core.Query ) ; return org.springframework.integration.jpa.core.Query . executeUpdate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.Class<T> < T > java.lang.Class<T> , java.lang.Object java.lang.Object ) { return entityManager . find ( java.lang.Class<T> , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.jpa.core.Query org.springframework.integration.jpa.core.Query ( java.lang.String java.lang.String , ParameterSource org.springframework.integration.jpa.core.ParameterSource ) { Query org.springframework.integration.jpa.core.Query = entityManager . createQuery ( java.lang.String ) ; void ( java.lang.String , org.springframework.integration.jpa.core.ParameterSource , org.springframework.integration.jpa.core.Query ) ; return org.springframework.integration.jpa.core.Query ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<?> < ? > java.util.List<?> ( java.lang.Class<?> < ? > java.lang.Class<?> , int int , int int ) { final java.lang.String java.lang.String = JpaUtils . getEntityName ( entityManager , java.lang.Class<> ) ; final Query org.springframework.integration.jpa.core.Query = entityManager . createQuery ( STRING + java.lang.String + STRING , java.lang.Class<> ) ; if ( int > NUMBER ) { org.springframework.integration.jpa.core.Query . setFirstResult ( int ) ; } if ( int > NUMBER ) { org.springframework.integration.jpa.core.Query . setMaxResults ( int ) ; } return org.springframework.integration.jpa.core.Query . getResultList ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<?> < ? > java.util.List<?> ( java.lang.String java.lang.String , ParameterSource org.springframework.integration.jpa.core.ParameterSource , int int , int int ) { final Query org.springframework.integration.jpa.core.Query = entityManager . createNamedQuery ( java.lang.String ) ; void ( java.lang.String , org.springframework.integration.jpa.core.ParameterSource , org.springframework.integration.jpa.core.Query ) ; if ( int > NUMBER ) { org.springframework.integration.jpa.core.Query . setFirstResult ( int ) ; } if ( int > NUMBER ) { org.springframework.integration.jpa.core.Query . setMaxResults ( int ) ; } return org.springframework.integration.jpa.core.Query . getResultList ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<?> < ? > java.util.List<?> ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> , ParameterSource org.springframework.integration.jpa.core.ParameterSource , int int , int int ) { final Query org.springframework.integration.jpa.core.Query ; if ( java.lang.Class<> == null ) { org.springframework.integration.jpa.core.Query = entityManager . createNativeQuery ( java.lang.String ) ; } else { org.springframework.integration.jpa.core.Query = entityManager . createNativeQuery ( java.lang.String , java.lang.Class<> ) ; } void ( java.lang.String , org.springframework.integration.jpa.core.ParameterSource , org.springframework.integration.jpa.core.Query ) ; if ( int > NUMBER ) { org.springframework.integration.jpa.core.Query . setFirstResult ( int ) ; } if ( int > NUMBER ) { org.springframework.integration.jpa.core.Query . setMaxResults ( int ) ; } return org.springframework.integration.jpa.core.Query . getResultList ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<?> < ? > java.util.List<?> ( java.lang.String java.lang.String , ParameterSource org.springframework.integration.jpa.core.ParameterSource ) { return java.util.List<?> ( java.lang.String , org.springframework.integration.jpa.core.ParameterSource , NUMBER , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<?> < ? > java.util.List<?> ( java.lang.String java.lang.String , ParameterSource org.springframework.integration.jpa.core.ParameterSource , int int , int int ) { Query org.springframework.integration.jpa.core.Query = org.springframework.integration.jpa.core.Query ( java.lang.String , org.springframework.integration.jpa.core.ParameterSource ) ; if ( int > NUMBER ) { org.springframework.integration.jpa.core.Query . setFirstResult ( int ) ; } if ( int > NUMBER ) { org.springframework.integration.jpa.core.Query . setMaxResults ( int ) ; } return org.springframework.integration.jpa.core.Query . getResultList ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String , ParameterSource org.springframework.integration.jpa.core.ParameterSource ) { Query org.springframework.integration.jpa.core.Query = org.springframework.integration.jpa.core.Query ( java.lang.String , org.springframework.integration.jpa.core.ParameterSource ) ; return org.springframework.integration.jpa.core.Query . getSingleResult ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return this . java.lang.Object ( java.lang.Object , NUMBER , false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , int int , boolean boolean ) { Assert . notNull ( java.lang.Object , STRING ) ; return this . java.lang.Object ( java.lang.Object , true , int , boolean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { this . void ( java.lang.Object , NUMBER , false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , int int , boolean boolean ) { Assert . notNull ( java.lang.Object , STRING ) ; java.lang.Object ( java.lang.Object , false , int , boolean ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , boolean boolean , int int , boolean boolean ) { java.lang.Object java.lang.Object = null ; if ( java.lang.Object instanceof java.lang.Iterable ) { @ java.lang.SuppressWarnings ( STRING ) java.lang.Iterable<java.lang.Object> < java.lang.Object > java.lang.Iterable<java.lang.Object> = ( java.lang.Iterable<java.lang.Object> < java.lang.Object > ) java.lang.Object ; int int = NUMBER ; int int = NUMBER ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) ; for ( java.lang.Object java.lang.Object : java.lang.Iterable<java.lang.Object> ) { if ( java.lang.Object == null ) { int ++ ; } else { if ( boolean ) { java.util.List<java.lang.Object> . boolean ( entityManager . merge ( java.lang.Object ) ) ; } else { entityManager . persist ( java.lang.Object ) ; } int ++ ; if ( int > NUMBER && int % int == NUMBER ) { entityManager . flush ( ) ; if ( boolean ) { entityManager . clear ( ) ; } } } } if ( org.springframework.integration.jpa.core.Log . isDebugEnabled ( ) ) { org.springframework.integration.jpa.core.Log . debug ( java.lang.String . java.lang.String ( STRING , boolean ? STRING : STRING , int , int ) ) ; } if ( boolean ) { java.lang.Object = java.util.List<java.lang.Object> ; } } else { if ( boolean ) { java.lang.Object = entityManager . merge ( java.lang.Object ) ; } else { entityManager . persist ( java.lang.Object ) ; } } if ( int > NUMBER ) { entityManager . flush ( ) ; if ( boolean ) { entityManager . clear ( ) ; } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , ParameterSource org.springframework.integration.jpa.core.ParameterSource , Query org.springframework.integration.jpa.core.Query ) { java.util.Set<org.springframework.integration.jpa.core.Parameter<?>> < Parameter < ? > > java.util.Set<org.springframework.integration.jpa.core.Parameter<?>> = org.springframework.integration.jpa.core.Query . getParameters ( ) ; if ( java.util.Set<org.springframework.integration.jpa.core.Parameter<?>> != null && ! java.util.Set<org.springframework.integration.jpa.core.Parameter<?>> . isEmpty ( ) ) { if ( org.springframework.integration.jpa.core.ParameterSource != null ) { for ( Parameter < ? > org.springframework.integration.jpa.core.Parameter<?> : java.util.Set<org.springframework.integration.jpa.core.Parameter<?>> ) { java.lang.String java.lang.String = org.springframework.integration.jpa.core.Parameter<> . getName ( ) ; java.lang.Integer java.lang.Integer = org.springframework.integration.jpa.core.Parameter<> . getPosition ( ) ; final java.lang.Object java.lang.Object ; if ( java.lang.Integer != null ) { if ( org.springframework.integration.jpa.core.ParameterSource instanceof PositionSupportingParameterSource ) { java.lang.Object = ( ( PositionSupportingParameterSource ) org.springframework.integration.jpa.core.ParameterSource ) . getValueByPosition ( java.lang.Integer ) ; org.springframework.integration.jpa.core.Query . setParameter ( java.lang.Integer , java.lang.Object ) ; } else { throw new JpaOperationFailedException ( STRING + STRING , java.lang.String ) ; } } else { if ( StringUtils . hasText ( java.lang.String ) ) { java.lang.Object = org.springframework.integration.jpa.core.ParameterSource . getValue ( java.lang.String ) ; org.springframework.integration.jpa.core.Query . setParameter ( java.lang.String , java.lang.Object ) ; } else { throw new JpaOperationFailedException ( STRING + STRING , java.lang.String ) ; } } } } else { throw new java.lang.IllegalArgumentException ( STRING ) ; } } }  <METHOD_END>
