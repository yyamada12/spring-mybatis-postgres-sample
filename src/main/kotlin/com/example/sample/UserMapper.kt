package com.example.sample

import org.apache.ibatis.annotations.*

@Mapper
interface UserMapper {

    @Select("SELECT * FROM users")
    fun findAll(): List<User>

    @Select("SELECT * FROM users WHERE id = #{id}")
    fun findById(id: Int): User?

    @Insert("INSERT INTO users(name, email) VALUES(#{name}, #{email})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    fun insert(user: User): Int

    @Update("UPDATE users SET name=#{name}, email=#{email} WHERE id=#{id}")
    fun update(user: User): Int

    @Delete("DELETE FROM users WHERE id=#{id}")
    fun delete(id: Int): Int
}
