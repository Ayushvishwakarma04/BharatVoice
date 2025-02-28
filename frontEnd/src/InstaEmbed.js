import React from "react";
import "./InstaEmbed.css";
import CopyrightIcon from '@material-ui/icons/Copyright';
import { Avatar, Button } from "@material-ui/core";
import { makeStyles } from "@material-ui/core/styles";


const useStyles = makeStyles((theme) => ({
  root: {
    display: "flex",
    "& > *": {
      margin: theme.spacing(1),
    },
  },

  large: {
    width: theme.spacing(8),
    height: theme.spacing(8),
  },


}));

function InstaEmbed() {

  const classes = useStyles();


  return (
    <div className="instaEmbed">
      <img src="/images/header1.png" alt="/images/header2.png" className="embed_image" />
      <div className="embedText">
        <h4>Hello Peeps 👋 !!!</h4>
        <h4>Welcome to BharatVoice ⚡ !!!</h4>

        <p>
          BharatVoice is a user-centric platform that provides real-time, accurate information about government schemes in a simple and accessible way. With features like multilingual support and personalized recommendations, it empowers users to easily discover and apply for schemes that meet their needs.
          <br />
          <br />
          <b>P.S.</b> This project has been created for educational purposes and is not affiliated with or endorsed by any government institution.
          <br />
          <br />
          <b>Features : </b>
          <ul>
            <li>User Authentication : Sign In and Sign Up</li>
            <li>Image Uploading for accesing new scheming</li>
            <li>User can add Comments to the Posts</li>
            <li>An Awesome User-Interface</li>
          </ul>
          <br />
        </p>
        <h4>Hope you have a great time, exploring the application in and out ✌ !!!</h4>
      </div>

      <div className="footer">
        <Avatar
          className="avatar"
          src="#"
          className={classes.large}
        />

        <div className="footer_content" >
          <h5>BharatVoice</h5>
        </div>


      </div>
      <div className="copyright">
        <CopyrightIcon fontSize="small" className="copyright_icon" />Epics Project
      </div>
    </div>
  );
}

export default InstaEmbed;
