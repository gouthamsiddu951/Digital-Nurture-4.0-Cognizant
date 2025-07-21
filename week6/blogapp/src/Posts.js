// src/Posts.js
import React from "react";
import Post from "./Post";

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
      errorInfo: null,
    };
  }

  // Step 6: Fetch Posts
  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => {
        this.setState({ posts: data });
      })
      .catch((error) => {
        this.setState({ hasError: true, errorInfo: error });
      });
  }

  // Step 7: Lifecycle hook to call loadPosts()
  componentDidMount() {
    this.loadPosts();
  }

  // Step 9: Handle unexpected rendering errors
  componentDidCatch(error, info) {
    alert(`An error occurred: ${error.toString()}`);
    this.setState({ hasError: true, errorInfo: info });
  }

  // Step 8: Render posts
  render() {
    if (this.state.hasError) {
      return <h2>Something went wrong.</h2>;
    }

    return (
      <div>
        <h1>Posts</h1>
        {this.state.posts.length > 0 ? (
          this.state.posts.map((post) => (
            <Post key={post.id} title={post.title} body={post.body} />
          ))
        ) : (
          <p>Loading...</p>
        )}
      </div>
    );
  }
}

export default Posts;
