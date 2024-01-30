# Spring MyBatis Postgres Sample
SpringBoot + MyBatis で PostgreSQL に接続するためのサンプルです


## 動作確認方法

1. docker compose up
2. ./gradlew bootRun

以下のコマンドで動作確認が可能。

全ユーザー取得:
```
curl -X GET http://localhost:8080/users
```
特定のユーザー取得: 
```
curl -X GET http://localhost:8080/users/1
```
ユーザー追加:
```
curl -X POST -H "Content-Type: application/json" -d '{"name":"Charlie", "email":"charlie@example.com"}' http://localhost:8080/users
```
ユーザー更新:
```
curl -X PUT -H "Content-Type: application/json" -d '{"id":1, "name":"Alice Updated", "email":"alice_updated@example.com"}' http://localhost:8080/users
```
ユーザー削除:
```
curl -X DELETE http://localhost:8080/users/1
```

### local で起動したdbへの接続コマンド
```shell
psql -h localhost -U postgres
```
パスワードは `password` 
