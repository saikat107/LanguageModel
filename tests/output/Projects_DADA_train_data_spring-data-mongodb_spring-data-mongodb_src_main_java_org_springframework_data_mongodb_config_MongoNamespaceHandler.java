<METHOD_START> public void void ( ) { registerBeanDefinitionParser ( STRING , new MappingMongoConverterParser ( ) ) ; registerBeanDefinitionParser ( STRING , new MongoClientParser ( ) ) ; registerBeanDefinitionParser ( STRING , new MongoDbFactoryParser ( ) ) ; registerBeanDefinitionParser ( STRING , new MongoJmxParser ( ) ) ; registerBeanDefinitionParser ( STRING , new MongoAuditingBeanDefinitionParser ( ) ) ; registerBeanDefinitionParser ( STRING , new MongoTemplateParser ( ) ) ; registerBeanDefinitionParser ( STRING , new GridFsTemplateParser ( ) ) ; }  <METHOD_END>