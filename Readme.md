# Repository event handler


## Step 1: create `AuditTrailListener`

![img.png](img.png)

## Step 2: add `@EntityListeners(AuditTrailListener.class)` to model file

![img_1.png](img_1.png)


    curl --location 'localhost:8080/test?name=af'


Result

![img_2.png](img_2.png)

