<METHOD_START> public void void ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . java.lang.Class<? extends java.lang.annotation.Annotation> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.dao.annotation.BeanFactory ) { super. setBeanFactory ( org.springframework.dao.annotation.BeanFactory ) ; if ( ! ( org.springframework.dao.annotation.BeanFactory instanceof ListableBeanFactory ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } this . advisor = new PersistenceExceptionTranslationAdvisor ( ( ListableBeanFactory ) org.springframework.dao.annotation.BeanFactory , this . java.lang.Class<> ) ; }  <METHOD_END>
