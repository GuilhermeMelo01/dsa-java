# ALL TOGETHER


***
### Domain 1: Cloud Concepts (24%)
````
Which AWS Cloud Adoption Framework (AWS CAF) perspective focuses on real-time insights and answers questions about strategy?
    - Business
````
````
Which design principles support the reliability pillar of the AWS Well-Architected Framework? (Choose two.)
    - Automatically scale to meet demand.
    - Automatically recover from failure.
````

references:
- [Amazon Well-Architected Framework](#well-architected-framework)

***
### Domain 2: Security and Compliance (30%)
````
Which AWS service supports user sign-up functionality and authentication to mobile and web applications?
    - Cognito
````
````
A company needs to check for IAM access keys that have not been rotated recently. Which AWS service should the company use to meet this requirement?
    - AWS Trusted Advisor
````

references:
- [Cognito](#cognito)
- [AWS Trusted Advisor](#aws-trusted-advisor)

***
### Domain 3: Cloud Technology and Services (34%)
````
Which AWS services or features provide disaster recovery solutions for Amazon EC2 instances?

1. EC2 Amazon Machine Image
    - AMIs are used to create backups of EC2 instances, and they can be used to launch replacement instances in the event 
    of a disaster or data loss.

2. Amazon Elastic Block Store (Amazon EBS) snapshots
    -  EBS snapshots allow you to create point-in-time backups of your EBS volumes. These snapshots can be used to 
    restore data or create new EBS volumes, making them a key component of disaster recovery for EC2 instances.
````

````
A company wants an Amazon S3 solution that provides access to object storage within single-digit milliseconds.
Which solution will meet these requirements?
  - S3 Express One Zone
````

````
Which security service automatically recognizes and classifies sensitive data or intellectual property on AWS?
  - Amazon Macie
````
````
A company has 5 TB of data stored in Amazon S3. The company plans to occasionally run queries on the data for analysis.
Which AWS service should the company use to run these queries in the MOST cost-effective manner?
  - Amazon Athena
````

references:
- [EC2](#elastic-compute-cloud)
- [S3](#amazon-s3)
- [Amazon Macie](#amazon-macie)
- [Amazon Athena](#amazon-athena)

***
### Domain 4: Billing, Pricing, and Support (12%)



***

## CONCEPTS

### ``Amazon Athena``
- Amazon Athena is a serverless query service that allows you to analyze data directly in Amazon S3 using standard SQL queries. You don't need to set up or manage any infrastructure; you only pay for the queries you run. It is well-suited for ad-hoc and exploratory analysis on data stored in S3 without the need for maintaining a separate database.

### ``Amazon Macie``
- Amazon Macie is a data security service provided by Amazon Web Services (AWS) that uses machine learning and pattern matching to discover, classify, and protect sensitive data stored in S3 buckets

### ``Amazon S3``
- Amazon Simple Storage Service (Amazon S3) is an object storage service offering industry-leading scalability, data availability, security, and performance

### ``Elastic Compute Cloud``
- Amazon Elastic Compute Cloud (Amazon EC2) is a web service that provides secure, resizable compute capacity in the 
cloud. Amazon EC2 offers many options that help you build and run virtually any application. With these possibilities,
getting started with EC2 is quick and easy to do.

### ``AWS Cloud Adoption Framework``
- O AWS Cloud Adoption Framework (AWS CAF) aproveita a experiência e as práticas recomendadas da AWS para ajudar você na
  transformação digital e acelerar seus resultados de negócios usando a AWS de forma inovadora. O AWS CAF identifica
  recursos organizacionais específicos que sustentam transformações na nuvem bem-sucedidas. Esses recursos fornecem
  orientações de práticas recomendadas que ajudam a melhorar sua preparação para a nuvem. O AWS CAF agrupa seus recursos
  em seis perspectivas: Negócios, Pessoas, Governança, Plataforma, Segurança e Operações. Cada perspectiva abrange um
  conjunto de recursos que as partes interessadas relacionadas funcionalmente possuem ou gerenciam na jornada de
  transformação na nuvem. Use o AWS CAF para identificar e priorizar oportunidades de transformação, avaliar e melhorar
  sua preparação para a nuvem e desenvolver iterativamente seu roteiro de transformação.

### ``AWS Trusted Advisor``
- O AWS Trusted Advisor ajuda você a otimizar custos, aumentar a performance, melhorar a segurança e a resiliência e
  operar em grande escala na nuvem. O Trusted Advisor avalia continuamente seu ambiente da AWS usando verificações de
  práticas recomendadas entre as categorias de otimização de custos da nuvem, performance, resiliência, segurança,
  excelência operacional e limites de serviço, e recomenda ações para remediar todos os desvios em relação às práticas
  recomendadas. O Trusted Advisor Priority ajuda os clientes do AWS Enterprise Support a se concentrarem nas
  recomendações mais importantes, fornecendo recomendações orientadas pelo contexto e priorizadas de sua equipe
  de contas da AWS.

### ``Indetity And Acess Management``
- Use AWS Identity and Access Management (IAM) to manage and scale workload and workforce access securely supporting 
your agility and innovation in AWS.

### ``Well-Architected Framework``
- The AWS Well-Architected Framework helps you understand the pros and cons of decisions you make while building systems
  on AWS. By using the Framework you will learn architectural best practices for designing and operating reliable, secure,
  efficient, cost-effective, and sustainable systems in the cloud.

- The pillars of the AWS Well-Architected Framework

|           Name           | Description                                                                                                                                                                                                                                                                                                                              |
|:------------------------:|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|  Operational excellence  | The ability to support development and run workloads effectively, gain insight into their operations, and to continuously improve supporting processes and procedures to deliver business value.                                                                                                                                         |
|         Security         | The security pillar describes how to take advantage of cloud technologies to protect data, systems, and assets in a way that can improve your security posture.                                                                                                                                                                          |  
|       Reliability        | The reliability pillar encompasses the ability of a workload to perform its intended function correctly and consistently when it’s expected to. This includes the ability to operate and test the workload through its total lifecycle. This paper provides in-depth, best practice guidance for implementing reliable workloads on AWS. |
|  Performance Efficiency  | The ability to use computing resources efficiently to meet system requirements, and to maintain that efficiency as demand changes and technologies evolve.                                                                                                                                                                               |
|    Cost Optimization     | The ability to run systems to deliver business value at the lowest price point.                                                                                                                                                                                                                                                          |
|      Sustainability      | The ability to continually improve sustainability impacts by reducing energy consumption and increasing efficiency across all components of a workload by maximizing the benefits from the provisioned resources and minimizing the total resources required.                                                                            |


### ``Cognito``
- Amazon Cognito is a fully managed identity platform for web and mobile applications. It simplifies adding user 
sign-up, sign-in, and access control features, offering various authentication options like user pools, identity pools, 
and integrations with social and enterprise identity providers.

### ``Rekognition``
- Amazon Rekognition is a cloud-based image and video analysis service that makes it easy to add advanced computer vision capabilities to your applications.

### ``AWS Elastic Beanstalk``
- AWS Elastic Beanstalk is a PaaS (Platform-as-a-Service) that simplifies deploying and managing web applications and
  services on AWS. It automates tasks like resource provisioning, load balancing, and auto-scaling, allowing developers
  to focus on their code. Elastic Beanstalk utilizes AWS services like EC2, S3, and Elastic Load Balancing to create and
  manage the environment for your application.


``POLLY - AI Voice Generator``
- Amazon Polly is a fully-managed service that generates voice on demand, converting any text to 
an audio stream. Using deep learning technologies to convert articles, web pages, PDF documents,
and other text-to-speech (TTS). Polly provides dozens of lifelike voices across a broad set of languages 
for you to build speech-activated applications that engage and convert. Meet diverse linguistic, 
accessibility, and learning needs of users across geographies and markets. Powerful neural networks 
and generative voice engines work in the background, synthesizing speech for you. Integrate the
Amazon Polly API into your existing applications to become voice-ready quickly. 

``LOOSE COUPLING``
- Loose coupling in software development refers to minimizing dependencies between different 
components or modules. This design approach aims to reduce the impact of changes in one component
on others, leading to more flexible, maintainable, and testable code.

``RIGHT SIZING``
- Right sizing is the process of matching instance types and sizes to your workload performance
and capacity requirements at the lowest possible cost.

``EC2 ALL UPFRONT``
- With the All Upfront option, you pay for the entire Reserved Instance term with one upfront payment.
This option provides you with the largest discount compared to On-Demand Instance pricing. 

``EC2 PARTIAL UPFRONT``
- With the Partial Upfront option, you make a low upfront payment and are then charged a discounted hourly
rate for the instance for the duration of the Reserved Instance term. The No Upfront option does not
require any upfront payment and provides a discounted hourly rate for the duration of the term.

``NAT gateway``
- NAT gateway allows instances in a private subnet to initiate **outbound** connections to the Internet,
while preventing inbound connections.

``Amazon Neptune``
- Amazon Neptune is a managed graph database service provided by Amazon Web Services (AWS). It's designed to store and 
query billions of relationships with low latency. Neptune supports both property graphs (using Gremlin) and Resource 
Description Framework (RDF) data (using SPARQL). It's used in various applications like knowledge graphs, 
fraud detection, and recommendation engines.

``AWS CloudTrail``
- AWS CloudTrail is a service that enables governance, compliance, operational auditing, and security monitoring by
logging and monitoring API calls made to every AWS resource in your account. It provides a record of every API call,
including details about the user, account, and source IP address. This information can be used for auditing, 
troubleshooting, and security analysis.

``AWS BUDGET``
- Using AWS Budgets, you can set a budget that alerts you when you exceed (or are forecasted to exceed) your budgeted
cost or usage amount. You can also set alerts based on your RI or Savings Plans Utilization and Coverage using AWS Budgets.

``AWS STORAGE GATEWAY FILE GATEWAY``
- Nearly all enterprises, regardless of industry, have to store files, whether they are backups, media content, or
files generated by specialized industry applications. Managing and scaling on-premises infrastructure to provide online
storage and distribution of such backup or content files is often burdensome and costly, requiring expensive hardware 
refreshes, data center expansion, and software licensing. These large file data repositories can be siloed in 
specialized file servers or backup systems, limiting access for file sharing, analytics, or media processing.

``AWS ARTIFACT``
- AWS Artifact, available in the console, is a self-service audit artifact retrieval portal that provides our 
customers with on-demand access to AWS’ compliance documentation and AWS agreements.
You can use AWS Artifact Reports **to download AWS security and compliance documents**, such as **AWS ISO certifications**, 
**Payment Card Industry (PCI),** and **System and Organization Control (SOC)** reports.
You can use AWS Artifact Agreements to review, accept, and track the status of AWS agreements such as the Business 
Associate Addendum (BAA).

``AWS CLOUDFORMATION``
- AWS CloudFormation is a service that allows users to model and manage AWS infrastructure resources in an automated and 
secure manner using Infrastructure as Code (IaC) principles. It enables users to define their desired infrastructure 
as templates, typically in JSON or YAML format, and then CloudFormation provisions and manages those resources. 
This approach promotes predictability, repeatability, and version control for infrastructure deployments. 

``Amazon GuardDuty``
- Amazon GuardDuty is a threat detection service that continuously monitors your AWS accounts and workloads for 
malicious activity and delivers detailed security findings for visibility and remediation.

``Amazon QuickSight``
- Amazon QuickSight is a cloud-based, serverless business intelligence service from Amazon Web Services (AWS) that 
allows users to create data visualizations and dashboards, enabling them to analyze data and gain insights quickly. 

***
``AWS KMS``
- Use AWS KMS to encrypt data across your AWS workloads, digitally sign data, encrypt within your applications using 
AWS Encryption SDK, and generate and verify message authentication codes (MACs).

***
### Migrate databases
``Database Migration Service (DMS)``
- AWS Database Migration Service (AWS DMS) is a web service that you can use to migrate data from a source data store
to a target data store
  
``AWS Schema Conversion Tool``
- You can use the AWS Schema Conversion Tool (AWS SCT) to convert your existing database schema from one database engine to another. 