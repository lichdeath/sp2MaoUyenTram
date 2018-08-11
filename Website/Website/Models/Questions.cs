﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Web;

namespace Website.Models
{
    [Table("Questions")]
    public class Questions
    {
        [Key,Required]
        public int QId{ get; set; }
        public String Question { get; set; }
        public String Method { get; set; }
        public String Teacher { get; set; }



        public Questions(int qId, string question, string method, string teacher)
        {
            this.QId = qId;
            this.Question = question;
            this.Method = method;
            this.Teacher = teacher;
        }
    }
}