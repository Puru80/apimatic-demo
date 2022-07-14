# API

```java
APIController aPIController = client.getAPIController();
```

## Class Name

`APIController`

## Methods

* [Add](../../doc/controllers/api.md#add)
* [Check](../../doc/controllers/api.md#check)
* [Check 1](../../doc/controllers/api.md#check-1)
* [List](../../doc/controllers/api.md#list)
* [Batch](../../doc/controllers/api.md#batch)
* [Batch 1](../../doc/controllers/api.md#batch-1)
* [Update](../../doc/controllers/api.md#update)


# Add

Add User to waitlist

```java
CompletableFuture<WaitlistResponse> addAsync(
    final WaitlistRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`WaitlistRequest`](../../doc/models/waitlist-request.md) | Body, Required | - |

## Response Type

[`WaitlistResponse`](../../doc/models/waitlist-response.md)

## Example Usage

```java
WaitlistRequest body = new WaitlistRequest();

aPIController.addAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Check

Check status of the waitlist for the user

```java
CompletableFuture<WaitlistResponse> checkAsync()
```

## Response Type

[`WaitlistResponse`](../../doc/models/waitlist-response.md)

## Example Usage

```java
aPIController.checkAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Check 1

Promote user in the waitlist

```java
CompletableFuture<WaitlistResponse> check1Async(
    final PromoteRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`PromoteRequest`](../../doc/models/promote-request.md) | Body, Required | - |

## Response Type

[`WaitlistResponse`](../../doc/models/waitlist-response.md)

## Example Usage

```java
PromoteRequest body = new PromoteRequest();

aPIController.check1Async(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# List

Approve list of users

```java
CompletableFuture<WaitlistResponse> listAsync(
    final List<WaitlistRequest> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<WaitlistRequest>`](../../doc/models/waitlist-request.md) | Body, Required | - |

## Response Type

[`WaitlistResponse`](../../doc/models/waitlist-response.md)

## Example Usage

```java
List<WaitlistRequest> body = new LinkedList<>();

WaitlistRequest body0 = new WaitlistRequest();
body.add(body0);

WaitlistRequest body1 = new WaitlistRequest();
body.add(body1);


aPIController.listAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Batch

Approve batch of users(Eg. Top n users)

```java
CompletableFuture<List<WaitlistResponse>> batchAsync(
    final ApproveRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApproveRequest`](../../doc/models/approve-request.md) | Body, Required | - |

## Response Type

[`List<WaitlistResponse>`](../../doc/models/waitlist-response.md)

## Example Usage

```java
ApproveRequest body = new ApproveRequest();

aPIController.batchAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Batch 1

Reject user from the waitlist

```java
CompletableFuture<WaitlistResponse> batch1Async(
    final WaitlistRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`WaitlistRequest`](../../doc/models/waitlist-request.md) | Body, Required | - |

## Response Type

[`WaitlistResponse`](../../doc/models/waitlist-response.md)

## Example Usage

```java
WaitlistRequest body = new WaitlistRequest();

aPIController.batch1Async(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update

Update the feature configurations

```java
CompletableFuture<WaitlistResponse> updateAsync(
    final FeatureRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`FeatureRequest`](../../doc/models/feature-request.md) | Body, Required | - |

## Response Type

[`WaitlistResponse`](../../doc/models/waitlist-response.md)

## Example Usage

```java
FeatureRequest body = new FeatureRequest();

aPIController.updateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

