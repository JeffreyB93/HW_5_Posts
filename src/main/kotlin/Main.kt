fun main(){
    val service = WallService
    val comment = Comment(1, canPost = true, groupsCanPost = false, canClose = true, canOpen = true)
    val post = Post(1, 2, 3, 4, "Первый пост!", 1,
        2, true, comment, "qwe", canPin = true, isFavorite = false, canDelete = true)
    service.add(post)
    println(service.posts[0])
    //println(service.posts[0])
}