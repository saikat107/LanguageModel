<METHOD_START> @ Before @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.jpa.domain.Specification<java.lang.Object> = ( Specification < java.lang.Object > ) mock ( Specification .class , withSettings ( ) . serializable ( ) ) ; when ( org.springframework.data.jpa.domain.Specification<java.lang.Object> . toPredicate ( org.springframework.data.jpa.domain.Root<java.lang.Object> , org.springframework.data.jpa.domain.CriteriaQuery<> , org.springframework.data.jpa.domain.CriteriaBuilder ) ) . thenReturn ( org.springframework.data.jpa.domain.Predicate ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Specifications < java.lang.Object > org.springframework.data.jpa.domain.Specifications<java.lang.Object> = where ( null ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> . toPredicate ( org.springframework.data.jpa.domain.Root<java.lang.Object> , org.springframework.data.jpa.domain.CriteriaQuery<> , org.springframework.data.jpa.domain.CriteriaBuilder ) , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Specifications < java.lang.Object > org.springframework.data.jpa.domain.Specifications<java.lang.Object> = not ( ( Specification < java.lang.Object > ) null ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> . toPredicate ( org.springframework.data.jpa.domain.Root<java.lang.Object> , org.springframework.data.jpa.domain.CriteriaQuery<> , org.springframework.data.jpa.domain.CriteriaBuilder ) , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Specifications < java.lang.Object > org.springframework.data.jpa.domain.Specifications<java.lang.Object> = where ( null ) ; org.springframework.data.jpa.domain.Specifications<java.lang.Object> = org.springframework.data.jpa.domain.Specifications<java.lang.Object> . and ( org.springframework.data.jpa.domain.Specification<java.lang.Object> ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> . toPredicate ( org.springframework.data.jpa.domain.Root<java.lang.Object> , org.springframework.data.jpa.domain.CriteriaQuery<> , org.springframework.data.jpa.domain.CriteriaBuilder ) , is ( org.springframework.data.jpa.domain.Predicate ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Specifications < java.lang.Object > org.springframework.data.jpa.domain.Specifications<java.lang.Object> = where ( org.springframework.data.jpa.domain.Specification<java.lang.Object> ) ; org.springframework.data.jpa.domain.Specifications<java.lang.Object> = org.springframework.data.jpa.domain.Specifications<java.lang.Object> . and ( null ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> . toPredicate ( org.springframework.data.jpa.domain.Root<java.lang.Object> , org.springframework.data.jpa.domain.CriteriaQuery<> , org.springframework.data.jpa.domain.CriteriaBuilder ) , is ( org.springframework.data.jpa.domain.Predicate ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Specifications < java.lang.Object > org.springframework.data.jpa.domain.Specifications<java.lang.Object> = where ( null ) ; org.springframework.data.jpa.domain.Specifications<java.lang.Object> = org.springframework.data.jpa.domain.Specifications<java.lang.Object> . or ( org.springframework.data.jpa.domain.Specification<java.lang.Object> ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> . toPredicate ( org.springframework.data.jpa.domain.Root<java.lang.Object> , org.springframework.data.jpa.domain.CriteriaQuery<> , org.springframework.data.jpa.domain.CriteriaBuilder ) , is ( org.springframework.data.jpa.domain.Predicate ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Specifications < java.lang.Object > org.springframework.data.jpa.domain.Specifications<java.lang.Object> = where ( org.springframework.data.jpa.domain.Specification<java.lang.Object> ) ; org.springframework.data.jpa.domain.Specifications<java.lang.Object> = org.springframework.data.jpa.domain.Specifications<java.lang.Object> . or ( null ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> . toPredicate ( org.springframework.data.jpa.domain.Root<java.lang.Object> , org.springframework.data.jpa.domain.CriteriaQuery<> , org.springframework.data.jpa.domain.CriteriaBuilder ) , is ( org.springframework.data.jpa.domain.Predicate ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Specifications < java.lang.Object > org.springframework.data.jpa.domain.Specifications<java.lang.Object> = where ( org.springframework.data.jpa.domain.Specification<java.lang.Object> ) ; org.springframework.data.jpa.domain.Specifications<java.lang.Object> = org.springframework.data.jpa.domain.Specifications<java.lang.Object> . and ( org.springframework.data.jpa.domain.Specification<java.lang.Object> ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> , is ( notNullValue ( ) ) ) ; @ java.lang.SuppressWarnings ( STRING ) Specifications < java.lang.Object > org.springframework.data.jpa.domain.Specifications<java.lang.Object> = ( Specifications < java.lang.Object > ) deserialize ( serialize ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> ) ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> , is ( notNullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Specifications < java.lang.Object > org.springframework.data.jpa.domain.Specifications<java.lang.Object> = where ( org.springframework.data.jpa.domain.Specification<java.lang.Object> ) ; org.springframework.data.jpa.domain.Specifications<java.lang.Object> = Specifications . not ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> . and ( org.springframework.data.jpa.domain.Specification<java.lang.Object> ) . or ( org.springframework.data.jpa.domain.Specification<java.lang.Object> ) ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> , is ( notNullValue ( ) ) ) ; @ java.lang.SuppressWarnings ( STRING ) Specifications < java.lang.Object > org.springframework.data.jpa.domain.Specifications<java.lang.Object> = ( Specifications < java.lang.Object > ) deserialize ( serialize ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> ) ) ; assertThat ( org.springframework.data.jpa.domain.Specifications<java.lang.Object> , is ( notNullValue ( ) ) ) ; }  <METHOD_END>