package com.example.sample

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun findAll(): List<User> = userService.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): User? = userService.findById(id)

    @PostMapping
    fun insert(@RequestBody user: User): User = userService.insert(user)

    @PutMapping
    fun update(@RequestBody user: User): User = userService.update(user)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) = userService.delete(id)
}
