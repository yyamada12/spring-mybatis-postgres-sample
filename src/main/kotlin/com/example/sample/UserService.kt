package com.example.sample

import org.springframework.stereotype.Service

@Service
class UserService(private val userMapper: UserMapper) {

    fun findAll(): List<User> = userMapper.findAll()

    fun findById(id: Int): User? = userMapper.findById(id)

    fun insert(user: User): User {
        userMapper.insert(user)
        return user
    }

    fun update(user: User): User  {
        userMapper.update(user)
        return user
    }

    fun delete(id: Int) = userMapper.delete(id)
}
