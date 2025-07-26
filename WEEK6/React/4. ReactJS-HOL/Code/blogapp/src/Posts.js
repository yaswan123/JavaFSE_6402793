import { Component } from "react";
import Post from "./Post";
class Posts extends Component{
    constructor(props){
        super(props);
        this.state={
            posts : [],
            err : null
        };
    }

    componentDidCatch(error) {
        alert("Error occurred: " + error);
    }


    loadPosts(){
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then((res)=>res.json())
        .then((data)=>{
            const postList = data.map((item)=>new Post(item.id,item.title,item.body));
            this.setState({posts:postList});
        })
        .catch((error)=>{
            this.setState({err:error.message});
            console.log(error);
        })
    }

    componentDidMount() {
         this.loadPosts();
    }

    render(){
        const {posts,err} = this.state;
        return(
            <div>
                <h1 style={{textAlign:'center'}}>Blog Posts</h1>
                <div>
                {err && <h2 style={{color:'red'}}>{err}</h2>}
                <div className="ParentContainer">
                    {posts.map((post)=>(
                        <div className="container" key={post.id}>
                            <h5 style={{textAlign:'center'}}><strong>{post.title}</strong></h5>
                            <p>{post.body}</p>
                        </div>
                    ))}
                </div>
                </div>
            </div>
        )
    }
}

export default Posts;