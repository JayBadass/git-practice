package src

fun main() {

}

interface Comment {
    val userNicknameComment: String,
    val mainTextComment: String,
    val commentOfComment: String,
}

interface CommentWithoutComment {
    val userNicknameComment: String
    val mainTextComment: String
}

interface UploadPost {
    val userNickname: String
    val mainText: String
    val createdDate: String
}


interface PostSection : UploadPost, Comment {
    val postId: String
    val title: String
    override val userNickname: String
        get() = " "
    val mainPostImageUrl: String
    val category: String
    override val createdDate: String
        get() = " "
    val modifiedDate: String
    override val mainText: String
        get() = " "
    override val userNicknameComment: String
        get() = " "
    override val mainTextComment: String
        get() = " "
    override val commentOfComment: String
        get() = " "

}

interface GuestBookSection : UploadPost, CommentWithoutComment {
    override val userNickname: String
        get() = " "
    override val mainText: String
        get() = " "
    override val createdDate: String
        get() = " "
    override val userNicknameComment: String
        get() = " "
    override val mainTextComment: String
        get() = " "
}

abstract class ProloguePage(
    val nickname: String,
    val profilePhotoUrl: String,
    val blogCreatedDate: Int,
    val blogName: String,
    val blogIntroduce: String,
    val selfIntroduction: String,
)

open class BlogPage : PostSection {
    open fun showWelcomeText() {
        println("Welcome to Our Blog")
    }

    override val postId: String
        get() = super.postId
    override val title: String
        get() = " "
    override val userNickname: String
        get() = " "
    override val mainPostImageUrl: String
        get() = " "
    override val category: String
        get() = " "
    override val createdDate: String
        get() = super.createdDate
    override val modifiedDate: String
        get() = " "
    override val mainText: String
        get() = super.mainText
    override val userNicknameComment: String
        get() = super.userNicknameComment
    override val mainTextComment: String
        get() = super.mainTextComment
    override val commentOfComment: String
        get() = super.commentOfComment

}

open class GuestBookPage : GuestBookSection {
    fun showWelcomeText() {
        println("Welcom to Our Gusetbook")
    }

    override val userNickname: String
        get() = " "
    override val mainText: String
        get() = " "
    override val createdDate: String
        get() = " "
    override val userNicknameComment: String
        get() = " "
    override val mainTextComment: String
        get() = " "
}
