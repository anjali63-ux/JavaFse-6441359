import React from 'react';
import Post from './Post'; // ✅ Correct case-sensitive import

class PostList extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: []
    };
  }

  componentDidMount() {
    const samplePosts = [
      { id: 1, title: 'Post One', body: 'This is the body of post one.' },
      { id: 2, title: 'Post Two', body: 'This is the body of post two.' },
      { id: 3, title: 'Post Three', body: 'This is the body of post three.' }
    ];

    this.setState({ posts: samplePosts });
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map((post) => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default PostList;
