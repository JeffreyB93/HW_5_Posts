data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date:Int?,// new
    val text: String,
    val replyOwnerId: Int?,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comment: Comment,
    val copyright: String,
    val likes: Likes,
    val reposts: Repost,
    val views: Int,
    val postType: String,
    val postSource: String,
    val geo: String,
    val attachments: ArrayList<Attachment>,
    val signerId: Int,
    val copyHistory: String,/// тут должен быть массив
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId:Int,
)